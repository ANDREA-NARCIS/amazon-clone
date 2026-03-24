package com.ecommerce.amazon_clone.config;

import com.ecommerce.amazon_clone.model.Product;
import com.ecommerce.amazon_clone.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadProducts(ProductRepository repo) {
        return args -> {

            if (repo.count() == 0) {

                repo.save(new Product(null,"iPhone 14","Apple smartphone",70000,"https://images.unsplash.com/photo-1511707171634-5f897ff02aa9"));
                repo.save(new Product(null,"Samsung TV","Smart LED TV",45000,"https://images.unsplash.com/photo-1593359677879-a4bb92f829d1"));
                repo.save(new Product(null,"Nike Shoes","Running shoes",5000,"https://images.unsplash.com/photo-1542291026-7eec264c27ff"));
                repo.save(new Product(null,"Gaming Laptop","High performance laptop",80000,"https://images.unsplash.com/photo-1517336714731-489689fd1ca8"));
                repo.save(new Product(null,"Headphones","Wireless headphones",2000,"https://images.unsplash.com/photo-1518444065439-e933c06ce9cd"));

                repo.save(new Product(null,"Smart Watch","Fitness tracker",3000,"https://images.unsplash.com/photo-1516574187841-cb9cc2ca948b"));
                repo.save(new Product(null,"Bluetooth Speaker","Portable speaker",2500,"https://images.unsplash.com/photo-1589003077984-894e133dabab?q=80&w=800"));
                repo.save(new Product(null,"Office Chair","Ergonomic chair",9000,"https://images.unsplash.com/photo-1586023492125-27b2c045efd7"));
                repo.save(new Product(null,"Backpack","Laptop bag",1500,"https://images.unsplash.com/photo-1514477917009-389c76a86b68"));
                repo.save(new Product(null,"Keyboard","Mechanical keyboard",3500,"https://images.unsplash.com/photo-1517336714731-489689fd1ca8"));

                repo.save(new Product(null,"Mouse","Gaming mouse",1200,"https://images.unsplash.com/photo-1587202372775-e229f172b9d7"));
                repo.save(new Product(null,"Tablet","Android tablet",20000,"https://images.unsplash.com/photo-1510557880182-3d4d3cba35a5"));
                repo.save(new Product(null,"Camera","DSLR camera",55000,"https://images.unsplash.com/photo-1516035069371-29a1b244cc32"));
                repo.save(new Product(null,"Microwave","Kitchen appliance",8000,"https://images.unsplash.com/photo-1586201375761-83865001e31c"));
                repo.save(new Product(null,"Fridge","Double door fridge",30000,"https://images.unsplash.com/photo-1581578731548-c64695cc6952"));

                repo.save(new Product(null,"Washing Machine","Fully automatic",25000,"https://images.unsplash.com/photo-1581578731548-c64695cc6952"));
                repo.save(new Product(null,"Air Conditioner","1.5 Ton AC",35000,"https://images.unsplash.com/photo-1581578731548-c64695cc6952"));
                repo.save(new Product(null,"Monitor","24 inch display",10000,"https://images.unsplash.com/photo-1587825140708-dfaf72ae4b04"));
                repo.save(new Product(null,"Router","WiFi router",2000,"https://images.unsplash.com/photo-1558494949-ef010cbdcc31"));
                repo.save(new Product(null,"Power Bank","10000mAh",1200,"https://images.unsplash.com/photo-1580910051074-3eb694886505"));
            }
        };
    }
}