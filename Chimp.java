package com.qa.animalchallenge;

public class Chimp extends Animals{

	@Override
	public void drinkWater() {
		System.out.println("yes");
		
	}

	@Override
	public void diet() {
		System.out.println("fruits, roots, nuts, leaves, plants, flowers, insects, meat");
		
	}

	@Override
	public void breathe() {
		System.out.println("yes");
		
	}

	@Override
	public void fly() {
		System.out.println("no");
		
	}

	@Override
	public void walk() {
		System.out.println("yes");
		
	}
	
	public void chimpFact() {
		System.out.println("Chimpanzees have Complex Family and Social Structures");
	}

}
