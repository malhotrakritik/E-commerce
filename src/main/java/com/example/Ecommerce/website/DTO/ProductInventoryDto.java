package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.ProductInventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInventoryDto {
    private Integer id;
    private int quantity;
    private Long createdAt;
    private Long modifiedAt;
    private Long deletedAt;

    public ProductInventoryDto(ProductInventory productInventory) {
        this.id = productInventory.getId();
        this.createdAt=productInventory.getCreatedAt();
        this.deletedAt= productInventory.getCreatedAt();
        this.modifiedAt= productInventory.getModifiedAt();
        this.quantity=productInventory.getQuantity();
    }
    public ProductInventoryDto(Integer id) {
        this.id = id;
    }
}
