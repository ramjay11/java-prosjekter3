package com.ramjava.spring.mongo.atlas.service;

import com.ramjava.spring.mongo.atlas.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product addProduct(Product product);
    Product updateProduct(int id, Product product);
    Product deleteProduct(int id);

}
