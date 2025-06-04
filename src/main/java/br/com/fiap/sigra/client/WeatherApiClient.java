package br.com.fiap.sigra.client;

import br.com.fiap.sigra.model.WeatherData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApiClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_KEY = "d8c65a3923cef49848adced3c6f2b022";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public WeatherData getWeather(String region) {
        String url = BASE_URL + "?q=" + region + "&appid=" + API_KEY + "&units=metric";
        return restTemplate.getForObject(url, WeatherData.class);
    }
}
