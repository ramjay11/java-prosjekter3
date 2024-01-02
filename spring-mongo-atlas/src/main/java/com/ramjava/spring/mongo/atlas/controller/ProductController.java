package com.ramjava.spring.mongo.atlas.controller;

import com.ramjava.spring.mongo.atlas.entity.Product;
import com.ramjava.spring.mongo.atlas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/all")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public Product deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
