package com.ramjava.bank.ansogning.service.impl;

import com.ramjava.bank.ansogning.dto.AccountDto;
import com.ramjava.bank.ansogning.entity.Account;
import com.ramjava.bank.ansogning.mapper.AccountMapper;
import com.ramjava.bank.ansogning.repository.AccountRepository;
import com.ramjava.bank.ansogning.service.AccountService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @PersistenceContext
    private EntityManager entityManager;
    private AccountRepository repository;
    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        // Convert Dto to Jpa Entity
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = repository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kontoen findes ikke"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto patchAccount(Long id, AccountDto accountDto) {
        Account existingAccount = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kontoen findes ikke"));
        if (accountDto.getAccountHolderName() != null) {
            existingAccount.setAccountHolderName(accountDto.getAccountHolderName());
        }

        if (accountDto.getBalance() != 0) {
            existingAccount.setBalance(accountDto.getBalance());
        }
        Account patchAccount = repository.save(existingAccount);
        return AccountMapper.mapToAccountDto(patchAccount);
    }

    @Override
    @Transactional // To ensure that it runs within the scope of a transaction
    public void deleteAccount(Long id) {
        Account account = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kontoen findes ikke"));
        repository.deleteById(id);
        resetAutoIncrement();
    }
    // Executes a native SQL query to reset the auto-increment counter of the accounts table to 1
    private void resetAutoIncrement() {
        entityManager.createNativeQuery("ALTER TABLE accounts AUTO_INCREMENT = 1").executeUpdate();
    }
}
