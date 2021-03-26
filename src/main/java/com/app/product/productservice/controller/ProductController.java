package com.app.product.productservice.controller;

import com.app.product.productservice.model.Product;
import com.app.product.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getProductInfo(){
        return productService.fetchProductDetails();
    }

    @GetMapping("/{id}")
    public Product getProductInfoById(@PathVariable String id) throws Exception {
        return productService.getProduct(id);
    }

    @PostMapping(value = "/add",produces = "application/json",consumes = "application/json")
    public List<Product> productAdded(@RequestBody List<Product> products){
        return productService.addProduct(products);
    }

    @DeleteMapping(value = "/delete",produces = "application/json",consumes = "application/json")
    public void productRemoved(@RequestBody List<Product> products){
         productService.removeProduct(products);
    }

}
