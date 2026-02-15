package net.oussama.product.Services;

import net.oussama.product.DTO.ProductDto;
import net.oussama.product.Entity.Product;

import java.util.Map;

public interface ServicesProduct {
    void createProduct(ProductDto product);
    Map<String,ProductDto> getAllProducts();
}
