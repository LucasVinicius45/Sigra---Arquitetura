package br.com.fiap.sigra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private String recipient; // Civil Defense or Industry
    private String message;
    private LocalDateTime sentAt;
}
