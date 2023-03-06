package com.aurionpro.test;

import com.aurionpro.model.ICarFactory;
import com.aurionpro.model.ICars;
import com.aurionpro.model.MarutiFactory;

public class FactoryTest {
public static void main(String[] args) {
	ICarFactory marutiFactory=new MarutiFactory();
ICars maruti=marutiFactory.makeCar();
maruti.start();
maruti.stop();
}
}
