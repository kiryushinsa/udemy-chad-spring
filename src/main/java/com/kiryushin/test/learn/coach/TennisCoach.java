package com.kiryushin.test.learn.coach;

import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Tennis DAILY WORKOUT";
    }

    @Override
    public String getDailyFortune() {
        return "Tennis DAILY FORTUNE";
    }
}
