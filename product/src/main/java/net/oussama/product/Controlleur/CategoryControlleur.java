package net.oussama.product.Controlleur;

import lombok.AllArgsConstructor;
import net.oussama.product.DTO.CategoryDto;
import net.oussama.product.DTO.ResponseDto;
import net.oussama.product.Entity.Category;
import net.oussama.product.Services.Impl.CategoryDtoImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@AllArgsConstructor
public class CategoryControlleur {
    private CategoryDtoImpl categoryServices;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create(@RequestBody CategoryDto categoryDto){
        categoryServices.createCategory(categoryDto);
        return ResponseEntity.ok().body(
                new ResponseDto(
                        "Categroy Created",
                        HttpStatus.CREATED
                )
        );
    }
    @GetMapping("/fetch")
    public ResponseEntity<List<Category>> Allcategory(){
        List<Category> categoryDtos = categoryServices.Allgategory();
        return ResponseEntity.ok().body(categoryDtos);
    }

}
