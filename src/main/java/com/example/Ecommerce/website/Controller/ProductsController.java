package com.example.Ecommerce.website.Controller;


import com.example.Ecommerce.website.DTO.ProductDto;
import com.example.Ecommerce.website.Modal.Products;
import com.example.Ecommerce.website.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();

    }
    @PostMapping("/add")
    public ProductDto addProducts(@RequestBody ProductDto productDto){
        log.info("entered in post");
        return productService.addProducts(productDto);
    }

}
