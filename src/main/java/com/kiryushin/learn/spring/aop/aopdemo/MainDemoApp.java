package com.kiryushin.learn.spring.aop.aopdemo;

import com.kiryushin.learn.spring.aop.dao.Account;
import com.kiryushin.learn.spring.aop.dao.AccountDAO;
import com.kiryushin.learn.spring.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        //get bean
        AccountDAO accountDAO = context.getBean( AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);


        //call method
        Account account = new Account(1, "John");
        accountDAO.addAccount(account,false);


        //close context
        context.close();
    }
}
