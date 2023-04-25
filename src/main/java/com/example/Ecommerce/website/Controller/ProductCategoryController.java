package com.example.Ecommerce.website.Controller;

import com.example.Ecommerce.website.DTO.ProductCategoryDto;
import com.example.Ecommerce.website.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/category")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public List<ProductCategoryDto> getAllCategories() {
        return productCategoryService.getAllCategories();
    }
}
