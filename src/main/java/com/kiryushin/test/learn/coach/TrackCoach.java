package com.kiryushin.test.learn.coach;

import com.kiryushin.test.learn.service.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	public void startup(){
		System.out.println("Track: inside startup");
	}

	public void  destroy(){
		System.out.println("Track: inside destroy");
	}

}










