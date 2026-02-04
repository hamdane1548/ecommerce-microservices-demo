package net.oussama.customers.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class ErrorDto {
    private String message;
    private HttpStatus status;
    private String apiPath;
    private LocalDateTime timestamp;
}
