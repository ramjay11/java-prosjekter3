package com.ramjava.spring.mongo.atlas.repo;

import com.ramjava.spring.mongo.atlas.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {
}
