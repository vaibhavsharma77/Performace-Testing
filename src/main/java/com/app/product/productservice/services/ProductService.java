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


    public Product getProduct(String id) throws Exception {
        return repository.getProductDetailsById(id);
    }

    public List<Product> addProduct(List<Product> product) {
         return repository.saveProducts(product);
    }

    public void removeProduct(List<Product> products) {
        repository.deleteProducts(products);
    }
}
