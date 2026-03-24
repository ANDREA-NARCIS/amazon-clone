package com.ecommerce.amazon_clone.service;

import com.ecommerce.amazon_clone.model.Cart;
import com.ecommerce.amazon_clone.model.Product;
import com.ecommerce.amazon_clone.model.User;
import com.ecommerce.amazon_clone.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartService {

    private final CartRepository repo;

    public CartService(CartRepository repo) {
        this.repo = repo;
    }

    public Cart getCart(User user) {
        return repo.findByUser(user)
                .orElseGet(() -> {
                    Cart cart = new Cart();
                    cart.setUser(user);
                    cart.setProducts(new ArrayList<>());
                    return repo.save(cart);
                });
    }

    public void addProduct(User user, Product product) {
        Cart cart = getCart(user);
        cart.getProducts().add(product);
        repo.save(cart);
    }

    public void removeProduct(User user, int index) {
        Cart cart = getCart(user);

        if (index < cart.getProducts().size()) {
            cart.getProducts().remove(index);
        }

        repo.save(cart);
    }
}