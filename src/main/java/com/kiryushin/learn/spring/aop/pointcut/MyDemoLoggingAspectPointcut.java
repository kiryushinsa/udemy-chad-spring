package com.kiryushin.learn.spring.aop.pointcut;


import com.kiryushin.learn.spring.aop.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(0)
public class MyDemoLoggingAspectPointcut {

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.dontSettersOthers()")
    private void nogettersandsetters() {
        System.out.println("\n =======> @Before execution advice for no getters and setters");
    }

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.getters()")
    private void forGetters() {
        System.out.println("\n =======> @Before execution advice for GETTERS");
    }

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.setters()")
    private void forSetters() {
        System.out.println("\n =======> @Before execution advice for SETTERS");
    }

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.forAllMethods()")
    private void forAllMethods() {
        System.out.println("\n =======> @Before execution advice for allMethods");
    }

    @AfterReturning(
            pointcut = "execution(* com.kiryushin.learn.spring.aop.dao.AccountDAO.findAccounts(..) )",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, List<Account> result) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("===> AfterReturning method" + method);
        System.out.println("===> result: " + result);
        upperCaseAllNames(result);
        System.out.println("===> result: " + result);
    }

    private void upperCaseAllNames(List<Account> result) {
        for (Account account : result){
            String upperName = account.getName().toUpperCase();
            account.setName(upperName);
        }
    }


}
