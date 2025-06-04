package br.com.fiap.sigra.service;

import br.com.fiap.sigra.client.SensorApiClient;
import br.com.fiap.sigra.client.WeatherApiClient;
import br.com.fiap.sigra.model.RiskPrediction;
import br.com.fiap.sigra.model.SensorData;
import br.com.fiap.sigra.model.WeatherData;
import org.springframework.stereotype.Service;

@Service
public class RiskPredictionService {

    private final WeatherApiClient weatherApiClient;
    private final SensorApiClient sensorApiClient;
    private final NotificationService notificationService;

    public RiskPredictionService(WeatherApiClient weatherApiClient, SensorApiClient sensorApiClient, NotificationService notificationService) {
        this.weatherApiClient = weatherApiClient;
        this.sensorApiClient = sensorApiClient;
        this.notificationService = notificationService;
    }

    public RiskPrediction analyzeRisk(String region) {
        WeatherData weather = weatherApiClient.getWeather(region);
        System.out.println(weather);
        SensorData sensor = sensorApiClient.getSensorData(region);

        int risk = calculateRisk(weather, sensor);
        String message = "Risco de falha elétrica: " + risk + "%";

        RiskPrediction prediction = new RiskPrediction(region, risk, message);

        if (risk >= 80) {
            notificationService.sendNotifications(prediction);
        }

        return prediction;
    }

    private int calculateRisk(WeatherData weather, SensorData sensor) {
        int risk = 0;
        if (weather.getMain().getHumidity() > 70) risk += 30;
        if (sensor.isVoltageDrop()) risk += 50;
        if (sensor.getTemperature() > 40) risk += 20;
        return Math.min(risk, 100);
    }
}
