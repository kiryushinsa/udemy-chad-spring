package com.kiryushin.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass() + " doing work addAccount in AccountDAO");
    }

    public void set() {
        System.out.println(getClass() + " SETTER addAccount in AccountDAO");
    }

    public void get() {
        System.out.println(getClass() + " GETTER work addAccount in AccountDAO");
    }
}
