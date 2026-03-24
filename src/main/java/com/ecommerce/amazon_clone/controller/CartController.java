package com.ecommerce.amazon_clone.controller;

import com.ecommerce.amazon_clone.model.Order;
import com.ecommerce.amazon_clone.model.Product;
import com.ecommerce.amazon_clone.repository.OrderRepository;
import com.ecommerce.amazon_clone.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final ProductService productService;
    private final OrderRepository orderRepository;

    public CartController(ProductService productService, OrderRepository orderRepository) {
        this.productService = productService;
        this.orderRepository = orderRepository;
    }

    @SuppressWarnings("unchecked")
    @GetMapping
    public String viewCart(HttpSession session, Model model) {

        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        model.addAttribute("cart", cart);
        return "cart";
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, HttpSession session) {

        Product product = productService.getById(id);

        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(product);
        session.setAttribute("cart", cart);

        return "redirect:/";
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/remove/{index}")
    public String removeFromCart(@PathVariable int index, HttpSession session) {

        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart != null && index < cart.size()) {
            cart.remove(index);
        }

        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/checkout")
    public String checkout(HttpSession session, Model model, Principal principal) {

        List<Product> cart = (List<Product>) session.getAttribute("cart");

        if (cart == null || cart.isEmpty()) {
            model.addAttribute("message", "Cart is empty!");
            return "cart";
        }

        // ✅ Create Order
        Order order = new Order();
        order.setUsername(principal.getName());
        order.setProducts(new ArrayList<>(cart));

        orderRepository.save(order);

        // ✅ Clear Cart
        cart.clear();
        session.setAttribute("cart", cart);

        model.addAttribute("message", "Order placed successfully!");
        return "order-success";
    }
}