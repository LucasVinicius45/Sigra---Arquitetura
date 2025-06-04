package br.com.fiap.sigra.client;

import br.com.fiap.sigra.model.SensorData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SensorApiClient {

    public SensorData getSensorData(String region) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(
                    new ClassPathResource("static/sensor_data.json").getInputStream(),
                    SensorData.class
            );
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
