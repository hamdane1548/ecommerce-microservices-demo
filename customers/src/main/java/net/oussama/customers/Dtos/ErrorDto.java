package net.oussama.customers.Dtos;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
public class ErrorDto {
    private String message;
    private HttpStatus status;
    private String apiPath;
    private LocalDateTime timestamp;
}
