package com.example.Ecommerce.website.DTO;

import com.example.Ecommerce.website.Modal.CartItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private int quantity;
    private Long createdAT;
    private Long modifiedAt;
    private Map<String,Object> productInfo;

    public CartItemDto(CartItem cartItem) {
        this.createdAT=cartItem.getCreatedAT();
        this.modifiedAt=cartItem.getModifiedAt();
        this.quantity= cartItem.getQuantity();
        this.productInfo=cartItem.getProductInfo();
    }
}
