package com.qa.animalchallenge;

public class Camel extends Animals {

	@Override
	public void drinkWater() {
		System.out.println("yes");
		
	}

	@Override
	public void diet() {
		System.out.println("grass, grains, wheat and oats");
		
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
	
	public void camelFact() {
		System.out.println("However, contrary to popular belief, it isn't used to store water. Instead, the hump stores fat.");
	}
	
	

}
