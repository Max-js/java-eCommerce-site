package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyNow {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/BuyNow")
    public String buynow(@RequestParam("productID") Long id, Model theModel) {
        Optional<Product> productId = productRepository.findById(id);

        if(productId.isPresent()) {
            Product product = productId.get();
            if(product.getInv() > 1) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "/success";
            } else {
                return"/failure";
            }
        } else {
            return "/failure";
        } 

    }
}
