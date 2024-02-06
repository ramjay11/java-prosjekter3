package com.ramjava.veer.beveiliging.met.jwt.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class GebruikersInformatie {

    private String username;
    private String password;
    private Set<String> roles;
}
