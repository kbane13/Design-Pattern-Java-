package com.aurionpro.model;

public class ProxyInternetAccess implements IOfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realIntAccess;
	private int Role;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public RealInternetAccess getRealIntAccess() {
		return realIntAccess;
	}

	public void setRealIntAccess(RealInternetAccess realIntAccess) {
		this.realIntAccess = realIntAccess;
	}

	@Override
	public void grantInternetAccess() {
		if(getRole()>4) {
			realIntAccess=new RealInternetAccess(employeeName);
			realIntAccess.grantInternetAccess();
		}
		else {
			 System.out.println("No Internet access granted");
		}
 

	}
	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		Role = role;
	}

	public ProxyInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}
//	public int getRole(String empName) {
//		return 3;
//		
//	}

	public ProxyInternetAccess(String employeeName,  int role) {
		super();
		this.employeeName = employeeName;
		
		Role = role;
	}

}
