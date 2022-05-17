package com.kiryushin.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addMainAccount() {
        System.out.println(getClass() + " doing work addAccount in MembershipDAO");
    }

    public void set() {
        System.out.println(getClass() + " SETTER addAccount in MembershipDAO");
    }

    public void getD(String d) {
        System.out.println(getClass() + " GETTER addAccount in MembershipDAO");
    }
}
