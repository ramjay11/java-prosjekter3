package com.ramjava.bank.ansogning.mapper;

import com.ramjava.bank.ansogning.dto.AccountDto;
import com.ramjava.bank.ansogning.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
        var account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account) {
        var accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
