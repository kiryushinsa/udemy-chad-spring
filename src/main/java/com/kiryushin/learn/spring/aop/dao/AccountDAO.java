package com.kiryushin.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    public List<Account> findAccounts(boolean tripWire) {

        if(tripWire) {
            throw new RuntimeException("Yeps is runtime exception!)");
        }

        List<Account> myAccounts = new ArrayList<>();

        Account acc1 = new Account(1,"John");
        Account acc2 = new Account(2,"Boris");
        Account acc3 = new Account(3,"Viktor");

        myAccounts.add(acc1);
        myAccounts.add(acc2);
        myAccounts.add(acc3);

        return myAccounts;
    }

    public void addAccount() {
        System.out.println(getClass() + " doing work addAccount in AccountDAO");
    }

    public void addAccount(Account account, boolean flag) {
        System.out.println(getClass() + " doing work addAccount in AccountDAO");
    }

    public void set() {

        System.out.println(getClass() + " SETTER addAccount in AccountDAO");
    }

    public void get() {

        System.out.println(getClass() + " GETTER work addAccount in AccountDAO");
    }
}
