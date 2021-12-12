package com.kiryushin.test.learn.lesson60;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// qualifier - set concrete bean for injection
	@Qualifier("randomFortuneService")
	//field injection
	@Autowired
	private FortuneService fortuneService;

	TennisCoach(){
		System.out.println(">>>inside default constructor");
	}

	/*
	// field injection. you can use any name
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>>TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/

	/*
	// Constructor injection
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
