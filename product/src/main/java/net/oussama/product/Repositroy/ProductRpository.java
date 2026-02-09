package net.oussama.product.Repositroy;

import net.oussama.product.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRpository extends JpaRepository<Product,Long> {
}
