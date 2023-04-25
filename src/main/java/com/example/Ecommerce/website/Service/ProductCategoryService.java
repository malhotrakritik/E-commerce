package com.example.Ecommerce.website.Service;

import com.example.Ecommerce.website.DTO.ProductCategoryDto;
import com.example.Ecommerce.website.Modal.ProductsCategory;
import com.example.Ecommerce.website.Repository.ProductCategoryRepo;
import com.example.Ecommerce.website.util.DtoConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductCategoryService {
    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    public List<ProductCategoryDto> getAllCategories() {
        List<ProductsCategory> productsCategories = productCategoryRepo.findAll();
        List<ProductCategoryDto> productCategoryDtoList = DtoConverter.getProductCategoryDtoList(productsCategories);
        log.info("productCategory size : {}", productCategoryDtoList.size());
        return productCategoryDtoList;
    }
}
