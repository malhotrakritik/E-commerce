package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.ProductCategoryDto;
import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @Column(name = "deleted_at")
    private Long deletedAt;

    public ProductsCategory(ProductCategoryDto productCategoryDto) {
        this.name = productCategoryDto.getName();
        this.productDescription = productCategoryDto.getProductDescription();
        this.createdAt = productCategoryDto.getCreatedAt();
        this.deletedAt = productCategoryDto.getDeletedAt();
        this.modifiedAt = productCategoryDto.getModifiedAt();
    }
}
