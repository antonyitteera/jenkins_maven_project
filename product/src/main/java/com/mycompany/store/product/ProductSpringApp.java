package com.mycompany.store.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductSpringApp {
    public static void main(String[] args) {
    	System.out.println("Testing maven toddf jenkins");
        SpringApplication.run(ProductSpringApp.class, args);
    }
}