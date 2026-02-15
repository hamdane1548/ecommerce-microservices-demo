package net.oussama.product.Services;

import net.oussama.product.DTO.CategoryDto;
import net.oussama.product.Entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryServices {
    void createCategory(CategoryDto categoryDto);
    List<Category> Allgategory();
}
