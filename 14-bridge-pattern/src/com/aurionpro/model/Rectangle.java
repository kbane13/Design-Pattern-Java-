package com.aurionpro.model;
public class Rectangle extends Shape {

	public Rectangle(IColor color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Rectangle Drawn"+color.fill();
	}
}

	