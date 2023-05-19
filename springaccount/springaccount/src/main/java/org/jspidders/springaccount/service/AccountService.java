package org.jspidders.springaccount.service;

import org.jspidders.springaccount.model.Account;
import org.jspidders.springaccount.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }

    public void addAccount(Account account) {
        repository.save(account);
    }
}
