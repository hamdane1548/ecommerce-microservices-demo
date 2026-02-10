package net.oussama.product.Services;

import net.oussama.product.DTO.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface CategoryServices {
    void createCategory(CategoryDto categoryDto);
    List<CategoryDto> Allgategory();
}
