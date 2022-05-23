package com.kiryushin.learn.spring.aop.aopdemo;

import com.kiryushin.learn.spring.aop.dao.Account;
import com.kiryushin.learn.spring.aop.dao.AccountDAO;
import com.kiryushin.learn.spring.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        //get bean
        AccountDAO accountDAO = context.getBean( AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);


        /*
        * is all works properly because afterReturning
        * works after returning value
        * to accountList
        */
        List<Account> accountList = accountDAO.findAccounts();
        System.out.println("\n Main ----");
        System.out.println(accountList);
        System.out.println("\n");

        //close context
        context.close();
    }
}
