package com.kiryushin.learn.spring.aop.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.kiryushin.learn.spring.aop")
public class DemoConfig {
}
