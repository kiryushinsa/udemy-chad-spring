package com.kiryushin.test.learn.lesson60;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for a daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
