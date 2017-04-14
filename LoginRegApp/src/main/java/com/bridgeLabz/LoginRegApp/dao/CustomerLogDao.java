package com.bridgeLabz.LoginRegApp.dao;

import com.bridgeLabz.LoginRegApp.model.Customer;

public interface CustomerLogDao {

	public Customer login(String email, String password);

}
