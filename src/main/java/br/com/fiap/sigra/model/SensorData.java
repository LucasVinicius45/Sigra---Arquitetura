package br.com.fiap.sigra.model;

import lombok.Data;

@Data
public class SensorData {
    private boolean voltageDrop;
    private double temperature;
    private double current;
}
