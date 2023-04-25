package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.DTO.ProductInventoryDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    @Column(name = "created_at")
    private Long createdAt;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @Column(name = "deleted_at")
    private Long deletedAt;

    public ProductInventory(ProductInventoryDto productInventoryDto) {
        this.id = productInventoryDto.getId();
        this.createdAt= productInventoryDto.getCreatedAt();
        this.deletedAt= productInventoryDto.getDeletedAt();
        this.modifiedAt= productInventoryDto.getModifiedAt();
        this.quantity= productInventoryDto.getQuantity();
    }

}
