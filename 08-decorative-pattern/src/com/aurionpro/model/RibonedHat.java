package com.aurionpro.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
		
	}
	@Override
	public int getPrice() {
		return 400+super.getPrice();
	}
	
	@Override
	public String getName() {
		
		return "Riboned hat";
	}

}
