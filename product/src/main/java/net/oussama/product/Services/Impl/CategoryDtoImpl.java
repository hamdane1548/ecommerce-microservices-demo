package net.oussama.product.Services.Impl;

import lombok.AllArgsConstructor;
import net.oussama.product.DTO.CategoryDto;
import net.oussama.product.Entity.Category;
import net.oussama.product.Exception.CategoryAleradyexist;
import net.oussama.product.Exception.CategoryNotfound;
import net.oussama.product.Repositroy.CategoryRepositroy;
import net.oussama.product.Services.CategoryServices;
import net.oussama.product.mapper.MapperCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryDtoImpl implements CategoryServices{
    private CategoryRepositroy categoryRepositroy;
    @Override
    public void createCategory(CategoryDto categoryDto) {
        Optional<Category> category = categoryRepositroy.findByName(categoryDto.getCategoryName());
        if (category.isPresent()) {
            throw  new CategoryAleradyexist("category already exists");
        } else {
            categoryRepositroy.save(MapperCategory.toCategory(categoryDto));
        }
    }
    @Override
    public List<CategoryDto> Allgategory() {
        List<Category> category = categoryRepositroy.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        category.forEach(
                category1 -> {
                   CategoryDto categoryRepository  = MapperCategory.toCategoryDto(category1);
                   categoryDtos.add(categoryRepository);
                }
        );
        return categoryDtos;
    }

}
