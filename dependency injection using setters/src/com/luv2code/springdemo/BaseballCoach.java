package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	
	private FortuneService fortuneService;
	
	//receiving the fortune object created by spring through constructor dependency injection.
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on Batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
