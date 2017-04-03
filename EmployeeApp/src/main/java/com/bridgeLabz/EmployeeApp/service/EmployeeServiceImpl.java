package com.bridgeLabz.EmployeeApp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.EmployeeApp.dao.EmployeeDao;
import com.bridgeLabz.EmployeeApp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	public void saveEmployee(Employee employee) {
		
		employeedao.saveEmployee(employee);
	}
	
	
	@Override
	public Employee authUser(String mail, String password) {
		
		return employeedao.authUser(mail, password);
	}


	@Override
	public Employee alreadyReg(String mail) {
		
		return employeedao.alreadyReg(mail);
	}


	@Override
	public List users() {
		
		return employeedao.users();
	}


	@Override
	public int changePassword(String mail,String newpassword) {
		
		return employeedao.changepassword(mail,newpassword);
		
	}

}
