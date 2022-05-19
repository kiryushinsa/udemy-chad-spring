package com.kiryushin.learn.spring.aop.pointcut.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class AspectOrderExampleTwo {

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.forAllAddMethods()")
    private void exampleOrder2() {
        System.out.println("\n EXAMPLE ORDER 2");
    }
}
