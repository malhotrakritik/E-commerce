package com.example.Ecommerce.website.Modal;

import com.example.Ecommerce.website.Converter.HashMapConverter;
import com.example.Ecommerce.website.DTO.CartItemDto;
import lombok.*;

import javax.persistence.*;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name="created_at")
    private Long createdAT;
    @Column(name = "modified_at")
    private Long modifiedAt;
    @Convert(converter = HashMapConverter.class)
    private Map<String,Object> productInfo;

    public CartItem(CartItemDto cartItemDto) {
        this.createdAT=cartItemDto.getCreatedAT();
        this.modifiedAt=cartItemDto.getModifiedAt();
        this.quantity= cartItemDto.getQuantity();
        this.productInfo=cartItemDto.getProductInfo();
    }
}

