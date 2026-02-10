package net.oussama.product.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.oussama.product.Entity.Product;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private  String categoryName;
    private  String categoryDescription;

}
