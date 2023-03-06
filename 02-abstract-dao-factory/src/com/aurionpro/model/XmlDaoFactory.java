package com.aurionpro.model;

public class XmlDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if (type.equalsIgnoreCase("employee")) {
			return new XmlEmployee();
		}
		if (type.equalsIgnoreCase("department")) {
			return new XmlDeptDao();
		}
		return null;

	}

}
