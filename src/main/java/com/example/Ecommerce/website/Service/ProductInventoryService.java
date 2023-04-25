package com.example.Ecommerce.website.Service;


import com.example.Ecommerce.website.DTO.ProductInventoryDto;
import com.example.Ecommerce.website.Modal.ProductInventory;
import com.example.Ecommerce.website.Repository.ProductInventoryRepo;
import com.example.Ecommerce.website.util.DtoConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductInventoryService {


    @Autowired
    private ProductInventoryRepo productInventoryRepo;
    public List<ProductInventoryDto> getAllProductInventoryInfo() {
        log.info("List of Product Inventory called");
        List<ProductInventory> productInventoryList=productInventoryRepo.findAll();
        List<ProductInventoryDto> productInventoryDtoList=DtoConverter.getProductInventoryDtoList(productInventoryList);
        return productInventoryDtoList;
    }

    public ProductInventoryDto getProductInventoryInfoById(int id) {
        log.info("Product Inventory findById called");
        ProductInventory productInventory=productInventoryRepo.findById(id).get();
        ProductInventoryDto productInventoryDto=new ProductInventoryDto(productInventory);
        return productInventoryDto;
    }

    public ProductInventoryDto addProducts(ProductInventoryDto productInventoryDto) {

        //Refernce purpose
//        ProductInventory productInventory=new ProductInventory(productInventoryDto);
//        ProductInventory productInventory1=productInventoryRepo.save(productInventory);
//        ProductInventoryDto productInventoryDto1=new ProductInventoryDto(productInventory1);
//        return productInventoryDto1;
        log.info("add products called ->{} ",productInventoryDto);
        ProductInventory productInventory=new ProductInventory(productInventoryDto);
        return new ProductInventoryDto(productInventoryRepo.save(productInventory));
    }
}
