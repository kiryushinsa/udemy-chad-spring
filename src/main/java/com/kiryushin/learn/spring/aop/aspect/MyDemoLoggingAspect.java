package com.kiryushin.learn.spring.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where add all our advices

    @Before("execution(public void add*())") // run this method BEFORE target method addAccount
    public void beforeAddAccountAdvice() {

        System.out.println("\n =======> @Before execution advice for addAccount");
    }
}
