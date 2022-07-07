package com.qa.animalchallenge;

public class Runner {
 public static void main(String[] args) {
	Camel colin = new Camel();
	colin.diet();
	colin.breathe();
	Animals barry = new Bee();
	((Bee)barry).beeFact();
}
}
