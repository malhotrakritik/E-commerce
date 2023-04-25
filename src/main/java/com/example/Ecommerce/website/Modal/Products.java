package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.ProductDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class Products{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "sku")
    private String SKU;
    @Column(name = "price")
    private float price;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @Column(name = "deleted_at")
    private Long deletedAt;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "products_category_id")
    private ProductsCategory productsCategoryId;

    @OneToOne(cascade =  CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "products_inventory_id")
    private ProductInventory productInventoryId;

    public Products(int id, String name, String description, String SKU, float price, Long createdAt, Long modifiedAt, Long deletedAt, ProductsCategory productsCategoryId, ProductInventory productInventoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.SKU = SKU;
        this.price = price;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.deletedAt = deletedAt;
        this.productsCategoryId = productsCategoryId;
        this.productInventoryId = productInventoryId;
    }

    public Products(ProductDto productDto){
        this.name= productDto.getName();
        this.deletedAt= productDto.getDeletedAt();
        this.createdAt= productDto.getCreatedAt();
        this.description= productDto.getDescription();
        this.modifiedAt= productDto.getModifiedAt();
        this.SKU= productDto.getSKU();
        this.price=productDto.getPrice();
        this.productsCategoryId = new ProductsCategory(productDto.getProductsCategoryDtoId());
        this.productInventoryId = new ProductInventory(productDto.getProductInventoryDtoId());
    }
}
