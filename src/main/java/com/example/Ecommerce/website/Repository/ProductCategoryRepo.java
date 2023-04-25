package com.example.Ecommerce.website.Repository;

import com.example.Ecommerce.website.Modal.ProductsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductsCategory, Integer> {

}
