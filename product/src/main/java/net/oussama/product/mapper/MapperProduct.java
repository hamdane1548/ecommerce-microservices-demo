package net.oussama.product.mapper;

import net.oussama.product.DTO.ProductDto;
import net.oussama.product.Entity.Product;
import org.springframework.beans.BeanUtils;

public class MapperProduct {
    public static Product toProduct(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
    public static ProductDto toProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
}
