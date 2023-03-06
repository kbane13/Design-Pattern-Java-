package com.aurionpro.model;

public class Laptop {
	private String ram;
	private String hdd;
	private String keyBoard;
	private String mouse;
	private boolean touchScreen;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getKeyBoard() {
		return keyBoard;
	}
	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyBoard=" + keyBoard + ", mouse=" + mouse + ", touchScreen="
				+ touchScreen + "]";
	}

}
