package com.qa.animalchallenge;

public class Bee extends Animals {

	@Override
	public void drinkWater() {
		System.out.println("yes");
		
	}

	@Override
	public void diet() {
		System.out.println("pollen and nectar");
		
	}

	@Override
	public void breathe() {
		System.out.println("yes");
		
	}

	@Override
	public void fly() {
		System.out.println("yes");
		
	}

	@Override
	public void walk() {
		System.out.println("yes");
		
	}
    
	public void beeFact() {
		System.out.println("The buff-tailed bumblebee has a brain the size of a poppy seed. "
				+ "Which is incredible given the fact scientists have managed to train them to "
				+ "score a goal in ‘bee football’ in return for a sugary treat.");
	}
}
