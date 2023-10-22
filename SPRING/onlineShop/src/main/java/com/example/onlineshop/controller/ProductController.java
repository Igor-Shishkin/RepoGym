package com.example.onlineshop.controller;

import com.example.onlineshop.model.Product;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    private List<Product> productList;

    public ProductController() {
        Product productOne = new Product("Bread", 2.3);
        Product productTwo = new Product("Car", 3587.99);
        Product productThree = new Product("Flute", 13456.3);
        Product productFour = new Product("Milk", 4.17);
        Product productFive = new Product("Butter", 5.3);

        productList = Arrays.asList(productOne,
                productTwo,
                productThree,
                productFour,
                productFive);
    }

    public List<Product> getListOfProducts() {
        return productList;
    }
}
