package com.example.Ecommerce.website.Repository;

import com.example.Ecommerce.website.Modal.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {

}
