package com.example.Ecommerce.website.Service;

import com.example.Ecommerce.website.DTO.CartItemDto;
import com.example.Ecommerce.website.Modal.CartItem;
import com.example.Ecommerce.website.Repository.CartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public CartItemDto addProductsToCart(CartItemDto cartItemDto) {
        CartItem cartItem =new CartItem(cartItemDto);
        CartItem cartItem1=cartRepository.save(cartItem);
        log.info("CartItem1 ->{}",cartItem1);
        CartItemDto cartItemDto1=new CartItemDto(cartItem1);
        return cartItemDto1;
    }
}
