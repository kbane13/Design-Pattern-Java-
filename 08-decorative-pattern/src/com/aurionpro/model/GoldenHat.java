package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		
	}
	@Override
	public int getPrice() {
		return 300+super.getPrice();
	}
	@Override
	public String getName() {
		
		return "Golden Hat";
	}
}
