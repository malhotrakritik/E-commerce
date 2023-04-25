package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.ProductsCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryDto {
    private Integer id;
    private String name;
    private String productDescription;
    private Long createdAt;
    private Long modifiedAt;
    private Long deletedAt;
    public ProductCategoryDto(ProductsCategory productCategory) {
        this.id = productCategory.getId();
        this.name = productCategory.getName();
        this.productDescription = productCategory.getProductDescription();
        this.createdAt = productCategory.getCreatedAt();
        this.deletedAt = productCategory.getDeletedAt();
        this.modifiedAt = productCategory.getModifiedAt();
    }
    public ProductCategoryDto(Integer id) {
        this.id = id;
    }
}
