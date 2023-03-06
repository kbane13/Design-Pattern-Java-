package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee e = new Employee(1, "krutika", new Consultant());

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getDescription());
		e.Promote(new SeniorConsultant());
		System.out.println("---------------");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getDescription());

	}
}
