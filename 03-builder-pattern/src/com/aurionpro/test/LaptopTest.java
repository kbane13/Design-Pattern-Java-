package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {

		LaptopBuilder lb = new LaptopBuilder();
		lb.addhdd("wd").addram("ryzen").addKeyBoard("Microsoft").addMouse("iball").addTouchScreen(true);
		Laptop laptop = lb.build();
		System.out.println(laptop);
	}

}
