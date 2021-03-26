package com.app.product.productservice.repository;

import com.app.product.productservice.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    public List<Product> fetchProductInfo(){

        List<Product> productList=new ArrayList<>();
        long BeforeTime=System.currentTimeMillis();
        for(int i=5;i<13000000;i++){
            Product product=new Product();
            product.setProductId("Product-"+i);
            product.setDescription("IPhone-Pro"+i);
            product.setPrice(1400.0+i);
            productList.add(product);
        }
        long AfterTime=System.currentTimeMillis();
        long timeTaken=AfterTime-BeforeTime;
        System.out.println("Total Time taken"+ timeTaken);
        return productList;


    }
}
