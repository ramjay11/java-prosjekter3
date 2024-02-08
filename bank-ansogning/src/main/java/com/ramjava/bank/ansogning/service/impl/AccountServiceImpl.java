package com.ramjava.bank.ansogning.service.impl;

import com.ramjava.bank.ansogning.dto.AccountDto;
import com.ramjava.bank.ansogning.entity.Account;
import com.ramjava.bank.ansogning.mapper.AccountMapper;
import com.ramjava.bank.ansogning.repository.AccountRepository;
import com.ramjava.bank.ansogning.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
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
    public void deleteAccount(Long id) {
        Account account = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kontoen findes ikke"));
        repository.deleteById(id);
    }
}
