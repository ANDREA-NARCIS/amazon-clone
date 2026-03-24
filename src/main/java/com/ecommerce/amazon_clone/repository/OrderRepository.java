package com.ecommerce.amazon_clone.repository;

import com.ecommerce.amazon_clone.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUsername(String username);
}