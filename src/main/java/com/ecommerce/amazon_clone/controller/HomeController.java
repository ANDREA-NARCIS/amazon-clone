package com.ecommerce.amazon_clone.controller;

import com.ecommerce.amazon_clone.model.User;
import com.ecommerce.amazon_clone.repository.UserRepository;
import com.ecommerce.amazon_clone.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    private final ProductService service;
    private final UserRepository userRepository;

    public HomeController(ProductService service, UserRepository userRepository) {
        this.service = service;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(Model model, Principal principal) {

        model.addAttribute("products", service.getAllProducts());

        if (principal != null) {
            User user = userRepository
                    .findByUsername(principal.getName())
                    .orElse(null);

            model.addAttribute("user", user);
        }

        return "index";
    }
}