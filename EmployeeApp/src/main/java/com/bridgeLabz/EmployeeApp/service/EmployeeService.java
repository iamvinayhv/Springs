package com.bridgeLabz.EmployeeApp.service;

import java.util.List;

import com.bridgeLabz.EmployeeApp.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee employee);

	public Employee authUser(String mail, String password);
	
	public Employee alreadyReg(String mail);

	public List users();
}
