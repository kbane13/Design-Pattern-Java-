package com.aurionpro.model;

public class LaptopBuilder {
	private Laptop laptop;

	public LaptopBuilder() {
		super();
		this.laptop = new Laptop();
		
	}
	public LaptopBuilder addram(String ram) {
		laptop.setRam(ram);
		return this;
		
	}
	public LaptopBuilder addhdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}
	
	public LaptopBuilder addKeyBoard(String kb) {
		laptop.setKeyBoard(kb);
		return this;
	}
	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}
	public LaptopBuilder addTouchScreen(boolean touch) {
		laptop.setTouchScreen(touch);
		return this;
	}
	public Laptop build() {
		return laptop;
	}
	
}
