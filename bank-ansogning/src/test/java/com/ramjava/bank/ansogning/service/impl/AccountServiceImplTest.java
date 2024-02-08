package com.ramjava.bank.ansogning.service.impl;

import com.ramjava.bank.ansogning.dto.AccountDto;
import com.ramjava.bank.ansogning.entity.Account;
import com.ramjava.bank.ansogning.mapper.AccountMapper;
import com.ramjava.bank.ansogning.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AccountServiceImplTest {
    @Mock
    private AccountRepository accountRepository;
    @InjectMocks
    private AccountServiceImpl accountService;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCreateAccount() {
        // Setup mock objects
        var accountDto = new AccountDto(1L, "Ramjay Romorosa", 11000);
        Account account = AccountMapper.mapToAccount(accountDto);
        when(accountRepository.save(any(Account.class))).thenReturn(account);
        // Exercise the method
        AccountDto result = accountService.createAccount(accountDto);
        // Verify the interactions with the mock objects
        assertEquals(accountDto, result);
        verify(accountRepository, times(1)).save(any(Account.class));
    }


}