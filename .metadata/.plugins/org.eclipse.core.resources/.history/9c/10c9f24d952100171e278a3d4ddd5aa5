package com.bridgeLabz.Details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.Details.dao.ProductDao;
import com.bridgeLabz.Details.model.Customer;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao  productDAO;

	public boolean addProduct(Customer customer) {
		
		return productDAO.addProduct(customer);
	}

	@Override
	public List getProduct(int id) {
		
		return productDAO.getProduct(id);
	}
}
