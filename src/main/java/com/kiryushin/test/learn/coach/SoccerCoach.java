package com.kiryushin.test.learn.coach;

import com.kiryushin.test.learn.service.FortuneService;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	SoccerCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Well Done! Spend on weight practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
