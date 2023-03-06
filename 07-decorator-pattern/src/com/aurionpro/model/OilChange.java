package com.aurionpro.model;

public class OilChange extends CarServiceDecorator {
	
	public OilChange(ICarService carobj) {
		super(carobj);
		
	}

	@Override
	public double getCost() {
		return 500+super.getCost();
	}

	

}
