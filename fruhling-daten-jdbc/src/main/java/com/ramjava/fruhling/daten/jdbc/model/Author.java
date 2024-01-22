package com.ramjava.fruhling.daten.jdbc.model;

import org.springframework.data.annotation.Id;

public record Author(
        @Id Integer id,
        String firstname,
        String lastname,
        String email,
        String username) {
}
