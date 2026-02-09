package net.oussama.product.Exception;

import net.oussama.product.DTO.ErrotDto;
import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@ControllerAdvice
public class GlobalExeption extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrotDto> globaleExecption(RuntimeException ex, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                new ErrotDto(
                     ex.getMessage(),
                        HttpStatus.INTERNAL_SERVER_ERROR,
                        webRequest.getDescription(false),
                        LocalDateTime.now()
                )
        );
    }

    @ExceptionHandler(CategoryNotfound.class)
    public ResponseEntity<ErrotDto> categroynotexist(CategoryNotfound categoryNotfound, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ErrotDto(
                        categoryNotfound.getMessage(),
                        HttpStatus.BAD_REQUEST,
                        webRequest.getDescription(false),
                        LocalDateTime.now()
                )
        );
    }
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request){
         List<ObjectError> error = ex.getBindingResult().getAllErrors();
         Map<String, String> errors = new HashMap<>();
         error.forEach(errorElement ->{
             String ErrorMessage = errorElement.getDefaultMessage();
             String FieldName = ((FieldError)errorElement).getField();
             errors.put(FieldName, ErrorMessage);
         });
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }
}
