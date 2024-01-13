package com.ramjava.transactioneel.bufferend.repository;

import com.ramjava.transactioneel.bufferend.entity.Afdeling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfdelingsRepo extends JpaRepository<Afdeling, Long> {
}
