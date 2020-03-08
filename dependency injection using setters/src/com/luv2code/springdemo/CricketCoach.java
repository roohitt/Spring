package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("inside no-arg constructor of cricket");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes a dayy";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
