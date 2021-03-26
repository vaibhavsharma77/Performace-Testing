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
        //long BeforeTime=System.currentTimeMillis();
        for(int i=5;i<10;i++){
            Product product=new Product();
            product.setProductId("Product-"+i);
            product.setDescription("IPhone-Pro"+i);
            product.setPrice(1400.0+i);
            productList.add(product);
        }
       // long AfterTime=System.currentTimeMillis();
        //long timeTaken=AfterTime-BeforeTime;
        //System.out.println("Total Time taken"+ timeTaken);
        return productList;
    }

    public Product getProductDetailsById(String id) throws Exception {

        for(Product product:fetchProductInfo()) {
            if (product.getProductId().equalsIgnoreCase(id)) {
                return product;
            } else {
                System.out.println("no product found");
            }
        }
         throw new Exception("exception with product id");
    }

    public List<Product> saveProducts(List<Product> product) {
        List<Product> productList=fetchProductInfo();
        productList.addAll(product);
        return productList;
    }

    public void deleteProducts(List<Product> products) {
        List<Product> productList=fetchProductInfo();
        productList.remove(products);
    }
}
