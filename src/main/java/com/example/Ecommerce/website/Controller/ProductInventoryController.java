package com.example.Ecommerce.website.Controller;

import com.example.Ecommerce.website.DTO.ProductInventoryDto;
import com.example.Ecommerce.website.Modal.ProductInventory;
import com.example.Ecommerce.website.Service.ProductInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/productinventory")
public class ProductInventoryController {


    @Autowired
    private ProductInventoryService productInventoryService;

    @GetMapping("/getAll")
    public List<ProductInventoryDto> getProductInventoryInfo(){
        return productInventoryService.getAllProductInventoryInfo();
    }


    @GetMapping("/byId/{id}")
    public ProductInventoryDto getProductInventoryById(@PathVariable int id){
        return productInventoryService.getProductInventoryInfoById(id);
    }


    @PostMapping
    public ProductInventoryDto addProductsInventory(@RequestBody ProductInventoryDto productInventoryDto){
        return productInventoryService.addProducts(productInventoryDto);
    }


}
