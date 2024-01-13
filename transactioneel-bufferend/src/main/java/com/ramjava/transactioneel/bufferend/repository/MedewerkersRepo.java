package com.ramjava.transactioneel.bufferend.repository;

import com.ramjava.transactioneel.bufferend.entity.Medewerker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedewerkersRepo extends JpaRepository<Medewerker, Long> {
}
