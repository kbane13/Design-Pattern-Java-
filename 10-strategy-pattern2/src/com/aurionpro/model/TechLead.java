package com.aurionpro.model;

public class TechLead implements IRole {

	@Override
	public String description() {
		return "I am TechLead";
	}

	@Override
	public String responsibility() {
		return "Assign work";
	}

}
