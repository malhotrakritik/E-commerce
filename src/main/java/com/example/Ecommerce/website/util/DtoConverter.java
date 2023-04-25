package com.example.Ecommerce.website.util;

import com.example.Ecommerce.website.DTO.ProductCategoryDto;
import com.example.Ecommerce.website.DTO.ProductInventoryDto;
import com.example.Ecommerce.website.Modal.ProductInventory;
import com.example.Ecommerce.website.Modal.ProductsCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DtoConverter {
    public static List<ProductCategoryDto> getProductCategoryDtoList(List<ProductsCategory> productsCategories) {
        List<ProductCategoryDto> productCategoryDtos = new ArrayList<>();
        if(productsCategories==null || productsCategories.isEmpty()) {
            return productCategoryDtos;
        }
        productCategoryDtos = productsCategories.stream().map(ProductCategoryDto::new).collect(Collectors.toList());
//        productCategoryDtos = productsCategories.stream().map(productCategory -> {
//            return new ProductCategoryDto(productCategory);
//        }).collect(Collectors.toList());
        return productCategoryDtos;
    }

    public static List<ProductInventoryDto> getProductInventoryDtoList(List<ProductInventory> productInventories) {
        List<ProductInventoryDto> productInventoryDtos = new ArrayList<>();
        if(productInventories==null || productInventories.isEmpty()) {
            return productInventoryDtos;
        }
        productInventoryDtos = productInventories.stream().map(ProductInventoryDto::new).collect(Collectors.toList());
        return productInventoryDtos;
    }

}
