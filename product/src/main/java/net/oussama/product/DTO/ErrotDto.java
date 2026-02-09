package net.oussama.product.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrotDto {
    private String message;
    private HttpStatus status;
    private String path;
    private LocalDateTime timestamp;
}
