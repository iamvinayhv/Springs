package com.bridgeLabz.LoginRegApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.LoginRegApp.dao.CustomerLogDao;
import com.bridgeLabz.LoginRegApp.model.Customer;

public class CustomerLogServiceImpl implements CustomerLogService {

	@Autowired
	private CustomerLogDao customerLogDao;
	
	public Customer login(String email, String password) {
		
		return customerLogDao.login(email,password);
	}

}
