package com.kiryushin.learn.spring.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class MyDemoLoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.kiryushin.learn.spring.aop.service.TrafficDelayService.*(..))")
    public Object aroundForTrafficDelayService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String method = proceedingJoinPoint.getSignature().toShortString();
        logger.info("\n =======>>> Executing @Around for method name: " + method + "\n");

        long begin = System.currentTimeMillis();

        Object result = null;

        try {
            result = proceedingJoinPoint.proceed(); // выполнить метод
        }
        catch (Exception e) {
            //log exception
            logger.warning("\n ======>>>>>> WARNING EXCEPTION was catch in @Around advice\n");

            // give user custom traffic
            result = "WARNING result get handled from catch in @Around\n";
        }


        long end = System.currentTimeMillis();
        long duration = end - begin;

        logger.info("\n => @Around time result is: " + duration / 1000.00 + " seconds\n");

        return result;
    }


}
