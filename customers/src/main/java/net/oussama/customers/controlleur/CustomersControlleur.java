package net.oussama.customers.controlleur;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.oussama.customers.Dtos.CustomersDto;
import net.oussama.customers.Dtos.InfoDatabase;
import net.oussama.customers.Dtos.ResponseDto;
import net.oussama.customers.Services.CustomersServices;
import net.oussama.customers.entity.Customers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Validated
@AllArgsConstructor
public class CustomersControlleur {
    private CustomersServices customersServices;
    private InfoDatabase infoDatabase;

    @PostMapping("/create")
   public ResponseEntity<ResponseDto> createcustomers(@Valid @RequestBody CustomersDto customer){
        customersServices.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ResponseDto(
                        HttpStatus.CREATED,
                        "customers create"
                )
        );
   }
   @GetMapping("/config")
   public ResponseEntity<InfoDatabase> configbase(){
        return ResponseEntity.status(HttpStatus.OK).body(infoDatabase);
   }
}
