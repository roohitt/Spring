package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public CricketCoach() {
		System.out.println("inside no-arg constructor of cricket");
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getTeam() {
		return team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
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
