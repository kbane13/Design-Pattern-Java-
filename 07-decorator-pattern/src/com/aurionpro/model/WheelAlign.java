package com.aurionpro.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService carobj) {
		super(carobj);
		
	}
	@Override
	public double getCost() {
		return 400+super.getCost();
	}

}
