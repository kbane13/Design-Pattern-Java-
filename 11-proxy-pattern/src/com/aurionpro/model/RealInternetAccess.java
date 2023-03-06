package com.aurionpro.model;

public class RealInternetAccess implements IOfficeInternetAccess {

	private String employeeName;
	
	public RealInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public String RealInternetAcceess() {
		return "Internet Access "+employeeName;
		
	}
	
	@Override
	public void grantInternetAccess() {
		System.out.println("Internet acces granted"+employeeName);

	}

}
