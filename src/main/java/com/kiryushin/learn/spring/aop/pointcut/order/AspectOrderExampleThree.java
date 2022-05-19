package com.kiryushin.learn.spring.aop.pointcut.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectOrderExampleThree {

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.forAllAddMethods()")
    private void exampleOrder3() {
        System.out.println("\n EXAMPLE ORDER 3");
    }
}
