package com.ramjava.veer.beveiliging.met.jwt.entity;

import lombok.Data;

import java.util.Set;

@Data
public class GebruikersInformatie {

    private String username;
    private String password;
    private Set<String> roles;
}
