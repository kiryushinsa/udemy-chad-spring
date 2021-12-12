package com.kiryushin.test.learn.lesson60;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	TennisCoach(){
		System.out.println(">>>inside default constructor");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>>TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}

	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
