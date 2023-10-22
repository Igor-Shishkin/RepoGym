package com.example.onlineshop.service;

import com.example.onlineshop.controller.ProductController;
import com.example.onlineshop.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
@Profile("pro")
public class ProductServicePro implements ProductService{
    private final ProductController productController;
    private final MessageSource messageSource;
    @Value("${client-properties.discount}")
    private double discount;
    @Value("${client-properties.vat}")
    private double vat;
    private Locale locale = Locale.forLanguageTag("pl");

    public ProductServicePro(ProductController productController, MessageSource messageSource) {
        this.productController = productController;
        this.messageSource = messageSource;
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
        sb.append(messageSource.getMessage("vatMessage", new Object[]{vat*sum}, locale));
        sb.append("\n");
        sb.append(messageSource.getMessage("discountMessage", new Object[]{discount*100}, locale));
        sb.append("\n");
        sb.append(messageSource.getMessage("totalCostMessage", null, locale));
        sb.append(sum*(1-discount));

        System.out.println(sb);

    }
}
