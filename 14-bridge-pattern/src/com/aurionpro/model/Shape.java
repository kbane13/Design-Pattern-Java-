package com.aurionpro.model;

public abstract class Shape {
	public IColor color;
	
	public Shape(IColor color) {
		this.color=color;
	}
	public abstract String draw();

}
