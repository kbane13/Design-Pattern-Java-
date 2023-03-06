package com.aurionpro.model;

public class Square extends Shape{

	public Square(IColor color) {
		super(color);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn"+color.fill();
	}

	
	

}
