package com.ramjava.spring.mongo.atlas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "products")
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
}
