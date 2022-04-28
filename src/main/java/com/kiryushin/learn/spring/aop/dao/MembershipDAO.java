package com.kiryushin.learn.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addMainAccount() {
        System.out.println(getClass() + " doing work addAccount in MembershipDAO");
    }
}
