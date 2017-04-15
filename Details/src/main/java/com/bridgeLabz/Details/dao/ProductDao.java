package com.bridgeLabz.Details.dao;


import com.bridgeLabz.Details.model.Customer;

public interface ProductDao {

	public boolean addProduct(Customer customer);

	public Customer getProduct(int id);
	

}
