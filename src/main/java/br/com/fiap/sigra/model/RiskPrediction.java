package br.com.fiap.sigra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskPrediction {
    private String region;
    private int riskLevel;
    private String message;
}
