package net.oussama.product.Controlleur;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.oussama.product.DTO.ProductDto;
import net.oussama.product.DTO.ResponseDto;
import net.oussama.product.Services.Impl.ServicesProductImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Validated
@RequestMapping("/api")
public class ProductRestControlleur {
    private ServicesProductImpl  servicesProductImpl;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create(@Valid @RequestBody ProductDto productDto) {
        servicesProductImpl.createProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        new ResponseDto(
                                "Votre product a cree",
                                HttpStatus.CREATED
                        )
                );
    }
}
