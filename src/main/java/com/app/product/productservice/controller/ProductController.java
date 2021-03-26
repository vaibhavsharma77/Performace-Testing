package com.app.product.productservice.controller;

import com.app.product.productservice.model.Product;
import com.app.product.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProductInfo(){
        return productService.fetchProductDetails();
    }
}
