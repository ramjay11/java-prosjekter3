package com.ramjava.bank.ansogning.repository;

import com.ramjava.bank.ansogning.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
