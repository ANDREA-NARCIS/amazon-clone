package com.ecommerce.amazon_clone.controller;

import com.ecommerce.amazon_clone.model.Product;
import com.ecommerce.amazon_clone.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Show Add Product Page
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // Save Product
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {

        System.out.println("---- DEBUG START ----");
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Image URL: " + product.getImageUrl());
        System.out.println("---- DEBUG END ----");

        productService.save(product);

        return "redirect:/";
    }
}