package net.oussama.product.mapper;

import net.oussama.product.DTO.CategoryDto;
import net.oussama.product.Entity.Category;
import net.oussama.product.Services.Impl.CategoryDtoImpl;
import org.springframework.beans.BeanUtils;

public class MapperCategory {
    public static Category toCategory(CategoryDto categoryDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto, category);
        return category;
    }
    public static CategoryDto toCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        BeanUtils.copyProperties(category, categoryDto);
        return categoryDto;
    }
}
