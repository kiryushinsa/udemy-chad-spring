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

        List<Account> accountList = null;

        try {
            boolean tripWire = true;
            accountDAO.findAccounts(tripWire);
        } catch (Exception e) {
            System.out.println("\n Caught exception in {try catch}: " + e);
        }



        //close context
        context.close();
    }
}
