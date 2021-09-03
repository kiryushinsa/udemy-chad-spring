package com.kiryushin.test.learn;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	public CricketCoach(){
		System.out.println("Cricket no arg construct");
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Cricket - setEmail");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket - setTeam");
		this.team = team;
	}



	// setterMethod
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket inside setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {	
		return "Yep. It's cricket object workout daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
