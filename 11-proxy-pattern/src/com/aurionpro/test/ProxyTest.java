package com.aurionpro.test;

import com.aurionpro.model.IOfficeInternetAccess;
import com.aurionpro.model.ProxyInternetAccess;

public class ProxyTest {

	public static void main(String[] args) {
 IOfficeInternetAccess acc=new ProxyInternetAccess("Krutika",3);
acc.grantInternetAccess();
	}

}
