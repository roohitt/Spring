package com.luv2code.springdemo;

public class TrackCoach  implements Coach {
	
	FortuneService fortunesevice;
	
	 public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		
		fortunesevice = theFortuneService;
		
	}
		

	@Override
	public String getDailyWorkout(){
		return "Spend 50 minutes on running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunesevice.getFortune();
	}
}
