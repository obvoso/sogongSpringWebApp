package edu.catholic.Service;

import edu.catholic.mapper.AccountMapper;
import edu.catholic.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }


    @Transactional
    public void insertAccount(Account account) {
        accountMapper.insertAccount(account);
    }
    public Account selectAccount(Account account) { return accountMapper.selectAccount(account); }

    public List<Account> searchAccount() { return accountMapper.searchAccount(); }
}
