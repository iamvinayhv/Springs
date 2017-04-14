package com.bridgeLabz.LoginRegApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.LoginRegApp.dao.CustomerRegisterDao;
import com.bridgeLabz.LoginRegApp.model.Customer;

public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	private CustomerRegisterDao customerRegDao;
	
	public boolean addCoust(Customer customer) {
		
		return customerRegDao.addCoustomer(customer);
	}
	
}
