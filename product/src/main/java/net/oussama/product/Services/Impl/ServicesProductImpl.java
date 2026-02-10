package net.oussama.product.Services.Impl;

import lombok.AllArgsConstructor;
import net.oussama.product.DTO.ProductDto;
import net.oussama.product.Entity.Category;
import net.oussama.product.Exception.CategoryNotfound;
import net.oussama.product.Repositroy.CategoryRepositroy;
import net.oussama.product.Repositroy.ProductRpository;
import net.oussama.product.Services.ServicesProduct;
import net.oussama.product.mapper.MapperProduct;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicesProductImpl implements ServicesProduct {
    private ProductRpository  productRpository;
    private CategoryRepositroy   categoryRepositroy;
    @Override
    public void createProduct(ProductDto product) {
        Optional<Category> category = categoryRepositroy.findById(product.getCategory_id());
        if(category.isEmpty()) {
            throw new CategoryNotfound("Category not found");
        }
        productRpository.save(MapperProduct.toProduct(product));
    }
}
