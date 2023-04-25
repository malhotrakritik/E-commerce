package com.example.Ecommerce.website.Service;

import com.example.Ecommerce.website.DTO.ProductDto;
import com.example.Ecommerce.website.Modal.Products;
import com.example.Ecommerce.website.Modal.Users;
import com.example.Ecommerce.website.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService{

    @Autowired
    private ProductRepo productRepo;

    public ProductDto getProductById(int id) {
        Products products=productRepo.findById(id).get();
        ProductDto productDto=new ProductDto();
        productDto.setDescription(products.getDescription());
        productDto.setName(products.getName());
        productDto.setSKU(products.getSKU());
        productDto.setPrice(products.getPrice());
        return productDto;

    }

    public List<ProductDto> getAllProducts() {
        List<Products> productsList=productRepo.findAll();
        List<ProductDto> productDtos=new ArrayList<>();
        for(Products products:productsList){
            ProductDto productDto=new ProductDto();
            productDto.setPrice(products.getPrice());
            productDto.setSKU(products.getSKU());
            productDto.setDescription(products.getDescription());
            productDto.setName(products.getName());
            productDtos.add(productDto);
        }
        return productDtos;
    }


    public ProductDto addProducts(ProductDto productDto) {
        Products products = new Products(productDto);
        Products savedProduct = productRepo.save(products);
        return new ProductDto();
//        return new ProductDto(savedProduct);
    }
}
