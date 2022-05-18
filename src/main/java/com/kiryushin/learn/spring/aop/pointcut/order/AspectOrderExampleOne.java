package com.kiryushin.learn.spring.aop.pointcut.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectOrderExampleOne {

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.forDaoPackage()")
    private void exampleOrder1() {
        System.out.println("\n EXAMPLE ORDER 1");
    }
}
