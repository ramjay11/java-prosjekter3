package com.ramjava.bank.ansogning.service;

import com.ramjava.bank.ansogning.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long id);
    AccountDto patchAccount(Long id, AccountDto accountDto);
    void deleteAccount(Long id);
}
