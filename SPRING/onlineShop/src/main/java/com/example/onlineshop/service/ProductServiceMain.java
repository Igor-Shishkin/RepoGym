package com.example.onlineshop.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ProductServiceMain {
    private final ProductService productService;

    public ProductServiceMain(ProductService productService) {
        this.productService = productService;

        productService.printInfo();
    }


}
