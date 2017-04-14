package com.bridgeLabz.CustomerProduct.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.CustomerProduct.dao.CustomerProductDao;
import com.bridgeLabz.CustomerProduct.model.Customar;

public class CustomerProductServiceImpl implements CustomerProductService {

	@Autowired
	private CustomerProductDao custDao;
	
	public boolean addDetails(Customar customer) {
		
		 return custDao.addDetails(customer);
	}

}
