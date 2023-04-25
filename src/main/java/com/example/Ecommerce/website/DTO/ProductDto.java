package com.example.Ecommerce.website.DTO;
import com.example.Ecommerce.website.Modal.ProductInventory;
import com.example.Ecommerce.website.Modal.Products;
import com.example.Ecommerce.website.Modal.ProductsCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Integer id;
    private String name;
    private String description;
    private String SKU;
    private float price;
    private Long createdAt;
    private Long modifiedAt;
    private Long deletedAt;
    private ProductCategoryDto productsCategoryDtoId;
    private ProductInventoryDto productInventoryDtoId;



    public ProductDto(Products product){
        this.name= product.getName();
        this.deletedAt= product.getDeletedAt();
        this.createdAt= product.getCreatedAt();
        this.description= product.getDescription();
        this.modifiedAt= product.getModifiedAt();
        this.SKU= product.getSKU();
        this.price=product.getPrice();
        this.productsCategoryDtoId = new ProductCategoryDto(product.getProductsCategoryId());
        this.productInventoryDtoId= new ProductInventoryDto(product.getProductInventoryId());
    }

}
