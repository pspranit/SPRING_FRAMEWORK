package org.jspiders.demospringaccount.service;

import org.jspiders.demospringaccount.model.Account;
import org.jspiders.demospringaccount.repository.AccountRepository;
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

    public void withdrawAmmount(Account account) {

        repository.findAll().forEach(e->{
            if (account.getAccNo()==e.getAccNo())
            {
                repository.withdrawAmountByAccNo(account.getAccNo(),account.getAmt());
            }

        });
    }

    public void depositeAmmount(Account account) {

        repository.findAll().forEach(e->{

            if(account.getAccNo()==e.getAccNo())
            {
                repository.saveAmountByAccNo(account.getAccNo(),account.getAmt());
            }
        });
    }
}
