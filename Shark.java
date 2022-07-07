package com.qa.animalchallenge;

public class Shark extends Animals{

	@Override
	public void drinkWater() {
		System.out.println("no its absorbed by the gills");
		
	}

	@Override
	public void diet() {
		System.out.println("fishes, crustaceans, molluscs, marine mammals, and other sharks");
		
	}

	@Override
	public void breathe() {
		System.out.println("No");
		
	}

	@Override
	public void fly() {
		System.out.println("no");
		
	}

	@Override
	public void walk() {
		System.out.println("no");
		
	}
	
	public void sharkFact() {
		System.out.println("All sharks have a 'sixth sense' that helps them hone in on prey during the final phase of attack: the ‘amupllae of lorenzini’ are found on sharks' snouts and can sense the electric fields emitted by animals in the surrounding water.");
	}

}
