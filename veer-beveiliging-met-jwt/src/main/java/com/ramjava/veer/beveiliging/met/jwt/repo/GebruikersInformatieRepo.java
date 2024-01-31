package com.ramjava.veer.beveiliging.met.jwt.repo;

import com.ramjava.veer.beveiliging.met.jwt.entity.GebruikersInformatie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GebruikersInformatieRepo extends JpaRepository<GebruikersInformatie, String> {
}
