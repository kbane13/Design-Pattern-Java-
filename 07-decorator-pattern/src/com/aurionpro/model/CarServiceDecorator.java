package com.aurionpro.model;

public abstract class CarServiceDecorator implements ICarService {

	private ICarService carobj;
	public CarServiceDecorator(ICarService carobj) {
		super();
		this.carobj = carobj;
	}
	@Override
	public double getCost() {
		return carobj.getCost();
	}

}
