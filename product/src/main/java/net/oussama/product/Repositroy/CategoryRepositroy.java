package net.oussama.product.Repositroy;

import net.oussama.product.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepositroy extends JpaRepository<Category,Long> {
    @Query("select category from Category category where category.categoryName like :name")
    Optional<Category> findByName(@Param("name") String name);
}
