package com.aurionpro.model;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat hat = new StandardHat();
		RibonedHat ribhat = new RibonedHat(hat);
		GoldenHat goldHat = new GoldenHat(ribhat);
		System.out.println(goldHat.getName());
		System.out.println(goldHat.getPrice());

	}

}
