package com.kiryushin.learn.spring.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*
* Collect all pointcut expressions in one class
* for sharing between different aspects
*
* */

@Aspect
public class AopExpressions {

    @Pointcut("execution(public void add*())")
    public void forAllAddMethods() {}

    @Pointcut("execution(public void add*(..))")
    public void forAllAddMethodsWithArguments() {}

    //pointcut matching all getters in package dao
    @Pointcut ("execution(* com.kiryushin.learn.spring.aop.dao.*.get*(..))")
    public void getters(){}

    //pointcut matching all setters in package dao
    @Pointcut ("execution(* com.kiryushin.learn.spring.aop.dao.*.set*(..))")
    public void setters(){}

    @Pointcut ("forAllAddMethods() && !( getters() || setters() )")
    public void dontSettersOthers() {}
}
