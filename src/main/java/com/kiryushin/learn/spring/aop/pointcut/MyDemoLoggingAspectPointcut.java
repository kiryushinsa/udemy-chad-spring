package com.kiryushin.learn.spring.aop.pointcut;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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

}
