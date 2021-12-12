package com.kiryushin.test.learn.lesson60;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "RandomFortuneService";
    }
}
