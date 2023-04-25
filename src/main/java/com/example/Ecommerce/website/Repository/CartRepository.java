package com.example.Ecommerce.website.Repository;

import com.example.Ecommerce.website.Modal.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {
}
