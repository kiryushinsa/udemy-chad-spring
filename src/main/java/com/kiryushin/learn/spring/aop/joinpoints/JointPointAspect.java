package com.kiryushin.learn.spring.aop.joinpoints;

import com.kiryushin.learn.spring.aop.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JointPointAspect {

    @Before("com.kiryushin.learn.spring.aop.pointcut.AopExpressions.forAllAddMethodsWithArguments()")
    private void exampleOrder1(JoinPoint joinPoint) {
        System.out.println("\n METHOD SIGNATURE");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method Join Point output:" + methodSignature);

        Object[] args = joinPoint.getArgs();

        for (Object tempArg: args) {
            System.out.println("Method Join Point get arguments: " + tempArg);

            if (tempArg instanceof Account) {
                Account account = (Account) tempArg;
                System.out.println("Account Name: " + account.getName());
                System.out.println("Acccount ID:" + account.getId());
            }
        }

    }


}
