package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractFactory;

public class DaoFactoryTest {

	public static void main(String[] args) {
	DaoFactoryProducer producer= new DaoFactoryProducer();
			IDaoAbstractFactory factory=producer.produce("db");
			IDao empXmlDao=factory.createDao("department");
			empXmlDao.save();
	}

}
