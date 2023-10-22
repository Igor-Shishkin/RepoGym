package com.example.onlineshop.service;

import com.example.onlineshop.controller.ProductController;
import com.example.onlineshop.model.Product;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
@Profile("start")
public class ProductServiceStart implements ProductService{
    private final ProductController productController;
    private final MessageSource messageSource;
    private final Locale locale = Locale.ENGLISH;

    public ProductServiceStart(ProductController productController, MessageSource messageSource) {
        this.productController = productController;
        this.messageSource = messageSource;
    }

    public List<Product> getListOfProducts(){
        return productController.getListOfProducts();
    }
    @Override
    public void printInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append(messageSource.getMessage("buyMessage", new Object[]{}, locale));

        double sum = 0;
        for (Product product : productController.getListOfProducts()) {
            sb.append(product);
            sb.append("\n");
            sum += product.getPrice();
        }
        sb.append(messageSource.getMessage("sumMessage", new Object[]{sum}, locale));
        sb.append("\n");

        System.out.println(sb);

    }
}
