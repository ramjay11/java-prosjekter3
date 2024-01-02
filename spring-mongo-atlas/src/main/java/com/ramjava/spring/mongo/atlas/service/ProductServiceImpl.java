package com.ramjava.spring.mongo.atlas.service;

import com.ramjava.spring.mongo.atlas.entity.Product;
import com.ramjava.spring.mongo.atlas.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo repo;
    @Override
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        var productVar = repo.findById(id).get();
        productVar.setName(product.getName());
        productVar.setPrice(product.getPrice());
        productVar.setQuantity(product.getQuantity());
        repo.save(productVar);
        return productVar;
    }

    @Override
    public Product deleteProduct(int id) {
        var product = repo.findById(id).get();
        repo.delete(product);
        return product;
    }
}
