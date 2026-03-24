package com.ecommerce.amazon_clone.controller;

import com.ecommerce.amazon_clone.model.Order;
import com.ecommerce.amazon_clone.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public String viewOrders(Model model, Principal principal) {

        String username = principal.getName();
        List<Order> orders = orderRepository.findByUsername(username);

        model.addAttribute("orders", orders);

        return "orders";
    }
}