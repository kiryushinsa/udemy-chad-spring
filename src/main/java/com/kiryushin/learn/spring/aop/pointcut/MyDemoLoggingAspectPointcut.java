package com.kiryushin.learn.spring.aop.pointcut;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspectPointcut {

    // this is where add all our advices

    @Pointcut ("execution(public void add*())")
    private void forDaoPackage() {}

    //pointcut matching all getters in package dao
    @Pointcut ("execution(* com.kiryushin.learn.spring.aop.dao.*.get*(..))")
    private void getters(){}

    //pointcut matching all setters in package dao
    @Pointcut ("execution(* com.kiryushin.learn.spring.aop.dao.*.set*(..))")
    private void setters(){}

    @Pointcut ("forDaoPackage() && !( getters() || setters() )")
    private void dontSettersOthers() {}

    @Before("dontSettersOthers()")
    private void nogettersandsetters() {
        System.out.println("\n =======> @Before execution advice for no getters and setters");
    }

    @Before("getters()")
    private void forGetters() {
        System.out.println("\n =======> @Before execution advice for GETTERS");
    }

    @Before("setters()")
    private void forSetters() {
        System.out.println("\n =======> @Before execution advice for SETTERS");
    }


}
