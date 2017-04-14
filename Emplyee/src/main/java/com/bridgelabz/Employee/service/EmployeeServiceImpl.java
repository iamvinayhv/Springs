package com.bridgelabz.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.Employee.dao.Employeedao;
import com.bridgelabz.Employee.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private Employeedao employeedao;
	
	public void saveEmployee(Employee employee) {
		
		employeedao.saveEmployee(employee);
	}

	
	
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
