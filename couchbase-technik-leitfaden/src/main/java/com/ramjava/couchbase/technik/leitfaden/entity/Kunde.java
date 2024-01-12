package com.ramjava.couchbase.technik.leitfaden.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Kunde {
    @Id
    private int id;
    @Field
    private String name;
    private String[] address;
}
