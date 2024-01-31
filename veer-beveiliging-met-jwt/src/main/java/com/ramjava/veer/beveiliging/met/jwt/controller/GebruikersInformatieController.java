package com.ramjava.veer.beveiliging.met.jwt.controller;

import com.ramjava.veer.beveiliging.met.jwt.entity.GebruikersInformatie;
import com.ramjava.veer.beveiliging.met.jwt.repo.GebruikersInformatieRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

public class GebruikersInformatieController {
    private GebruikersInformatieRepo gebruikersInformatieRepo;

    public GebruikersInformatieController(GebruikersInformatieRepo gebruikersInformatieRepo) {
        this.gebruikersInformatieRepo = gebruikersInformatieRepo;
    }
    @GetMapping("/gebruikers")
    public List<GebruikersInformatie> getAllGebruikersInformatie() {
        return gebruikersInformatieRepo.findAll();
    }
    @PostMapping("/register")
    public GebruikersInformatie registerGebruikersInformatie(@RequestBody GebruikersInformatie gebruikersInformatie) {
        if (gebruikersInformatie.getRoles() == null) {
            gebruikersInformatie.setRoles(Set.of("GEBRUIKER"));
        }
        return gebruikersInformatieRepo.save(gebruikersInformatie);
    }
}
