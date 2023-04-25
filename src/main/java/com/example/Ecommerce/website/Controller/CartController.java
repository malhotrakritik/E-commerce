package com.example.Ecommerce.website.Controller;
import com.example.Ecommerce.website.DTO.CartItemDto;
import com.example.Ecommerce.website.Service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Slf4j
public class CartController {

    @Autowired
    private CartService cartService;
    @PostMapping("/addToCart")
    public CartItemDto addProductsToCart(@RequestBody CartItemDto cartItemDto){
        log.info("Entered Controller ->{}",cartItemDto);
        return cartService.addProductsToCart(cartItemDto);
    }
}
