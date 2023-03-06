package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {
public List<IEmployee> employees;

	
	public EmployeeDirectory() {
	super();
	this.employees = new ArrayList<>();
}
	public void addEmployee(IEmployee emp) {
		employees.add(emp);
	}
	public void removeEmployee() {
		employees.remove(0);
	}


	@Override
	public void showEmployeeDetails() {
      for(IEmployee x:employees) {
    	  System.out.println(x);
      }
      
      
	}
	@Override
	public String toString() {
		return "EmployeeDirectory [employees=" + employees + "]";
	}

}
