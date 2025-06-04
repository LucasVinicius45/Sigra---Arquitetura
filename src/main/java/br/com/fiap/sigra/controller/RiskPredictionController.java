package br.com.fiap.sigra.controller;

import br.com.fiap.sigra.model.RiskPrediction;
import br.com.fiap.sigra.service.RiskPredictionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-prediction")
public class RiskPredictionController {

    private final RiskPredictionService riskPredictionService;

    public RiskPredictionController(RiskPredictionService riskPredictionService) {
        this.riskPredictionService = riskPredictionService;
    }

    @GetMapping
    public ResponseEntity<RiskPrediction> getRiskPrediction(@RequestParam String region) {
        RiskPrediction risk = riskPredictionService.analyzeRisk(region);
        return ResponseEntity.ok(risk);
    }
}
