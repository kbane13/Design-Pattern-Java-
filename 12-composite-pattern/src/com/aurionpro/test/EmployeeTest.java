package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
IEmployee dev1=new Developer("Krutika","JUnior Developer");
	IEmployee dev2=new Developer("Rasika", "Senior Developer");
	EmployeeDirectory devDirectory=new EmployeeDirectory();
	devDirectory.addEmployee(dev1);
	devDirectory.addEmployee(dev2);
	IEmployee man1=new Manager("Komal","DotNet Manager");
	IEmployee man2=new Manager("Sheetal","AWS Manager");
	EmployeeDirectory manDirectory=new EmployeeDirectory();
	manDirectory.addEmployee(man1);
	manDirectory.addEmployee(man2);
	
	EmployeeDirectory compDirectory=new EmployeeDirectory();
	compDirectory.addEmployee(devDirectory);
	compDirectory.addEmployee(manDirectory);
	compDirectory.showEmployeeDetails();
	
	}

}
