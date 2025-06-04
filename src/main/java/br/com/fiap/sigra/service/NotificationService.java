package br.com.fiap.sigra.service;

import br.com.fiap.sigra.model.Notification;
import br.com.fiap.sigra.model.RiskPrediction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class NotificationService {

    public void sendNotifications(RiskPrediction riskPrediction) {
        String message = "Alto risco detectado (" + riskPrediction.getRiskLevel() + "%) em " + riskPrediction.getRegion();

        Notification civilDefense = new Notification("Defesa Civil", message, LocalDateTime.now());
        Notification industry = new Notification("Indústria", message, LocalDateTime.now());

        log.info("Notificação enviada para a Defesa Civil: {}", civilDefense);
        log.info("Notificação enviada para a indústria: {}", industry);
    }
}
