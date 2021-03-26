package com.app.product.productservice.services;

import com.app.product.productservice.model.Product;
import com.app.product.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> fetchProductDetails(){
        return repository.fetchProductInfo();
    }

}
