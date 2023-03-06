package com.aurionpro.model;

public class Employee  {
	private int id;
	private String name;
	private IRole role;
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IRole getRole() {
		return role;
	}
	public void Promote(IRole role) {
		this.role = role;
	}
	public  String getDescription() {
		return role.description();
	}
	public void getResponsibility() {
		role.responsibility();
	}
	
	

}
