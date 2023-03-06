package com.aurionpro.model;

public class SeniorConsultant implements IRole{

	@Override
	public String description() {
		return "I am SeniorConsultant" ;
	}

	@Override
	public String responsibility() {
		return "Review Code";
	}

}
