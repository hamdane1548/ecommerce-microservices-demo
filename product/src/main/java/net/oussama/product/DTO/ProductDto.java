package net.oussama.product.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.oussama.product.Entity.Category;

@Data @AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    @Size(min = 1, max = 100,message = "le title de produit il doit contient ou min 1 et 100 max")
    private String title;
    private String description;
    private String price;
    private Integer quantity;
    private Long category_id;
}
