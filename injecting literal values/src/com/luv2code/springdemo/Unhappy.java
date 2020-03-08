
package com.luv2code.springdemo;

public class Unhappy implements FortuneService{
	
	@Override
	public String getFortune() {
		return "Today is yur Unlucky day";
	}

}
