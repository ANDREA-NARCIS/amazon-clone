package com.ecommerce.amazon_clone.repository;

import com.ecommerce.amazon_clone.model.Cart;
import com.ecommerce.amazon_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Get cart by user (important for future upgrade)
    Optional<Cart> findByUser(User user);
}