package com.aurionpro.model;

public class DaoFactoryProducer {

	 public  IDaoAbstractFactory produce(String factoryType) {
		 if(factoryType.equalsIgnoreCase("xml")) {
			 return new XmlDaoFactory();
		 }
		 if(factoryType.equalsIgnoreCase("db")) {
			 return new DBDaoFactory();
		 }
		return null;
		
	} 
}
