package net.oussama.customers.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class CustomersDto {
    @NotEmpty(message = "the field conn't be null ")
    @Size(min = 3 , max = 20)
    private String firstname;
    @Size(min = 3 , max = 20)
    private String lastname;
    @Email(message = "pls entre format valid of email")
    private String email;
    @Pattern(regexp = "(^[0-9]{10})")
    private String phone;

}
