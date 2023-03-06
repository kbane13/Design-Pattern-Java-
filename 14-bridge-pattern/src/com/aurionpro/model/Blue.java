package com.aurionpro.model;

public class Blue implements IColor {
    @Override
    public String fill() {
        return "Color is Blue";
    }

	@Override
	public String toString() {
		return "Blue []";
	}
}