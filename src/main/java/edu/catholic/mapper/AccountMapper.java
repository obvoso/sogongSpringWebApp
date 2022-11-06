package edu.catholic.mapper;

import edu.catholic.model.Account;

import java.util.List;

public interface AccountMapper {
    void insertAccount(Account account);
    Account selectAccount(Account account);
    List<Account> searchAccount();
}