package com.example.Ecommerce.website.Repository;

import com.example.Ecommerce.website.Modal.ProductInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductInventoryRepo extends JpaRepository<ProductInventory,Integer> {
}
