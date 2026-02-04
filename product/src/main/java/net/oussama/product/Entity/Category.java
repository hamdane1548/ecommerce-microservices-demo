package net.oussama.product.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter

public class Category extends BaseEntity{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  String categoryId;
    private  String categoryName;
    private  String categoryDescription;
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private List<Product> products;
}
