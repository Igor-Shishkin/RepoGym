package com.example.onlineshop.service;

import com.example.onlineshop.controller.ProductController;
import com.example.onlineshop.model.Product;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConfigurationProperties(prefix = "client-properties")
public interface ProductService {
    void printInfo();
}
