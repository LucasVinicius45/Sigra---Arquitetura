package br.com.fiap.sigra.model;

import lombok.Data;

@Data
public class WeatherData {
    private Main main;

    @Data
    public static class Main {
        private double temp;
        private double humidity;
        private double pressure;
    }
}
