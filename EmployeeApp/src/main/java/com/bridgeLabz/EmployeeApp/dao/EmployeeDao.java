package com.bridgeLabz.EmployeeApp.dao;


import java.util.List;

import com.bridgeLabz.EmployeeApp.model.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee employee);
	
	public Employee authUser(String mail, String password);
	
	public Employee alreadyReg(String mail);

	public List users();
}
