package com.bridgeLabz.LoginRegApp.productService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.LoginRegApp.productDao.ProductDao;
import com.bridgeLabz.LoginRegApp.productModel.CustomerProduct;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public boolean addProduct(CustomerProduct product) {

		return productDao.addProduct(product);
	}
	
	
	
}
