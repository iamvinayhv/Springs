package com.bridgeLabz.LoginRegApp.productController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.LoginRegApp.productModel.CustomerProduct;
import com.bridgeLabz.LoginRegApp.productModel.Products;
import com.bridgeLabz.LoginRegApp.productService.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="addProduct",method=RequestMethod.POST)
	public ResponseEntity<String> addProduct(@RequestBody CustomerProduct product) {
	
		boolean result = productService.addProduct(product);
		
		if(result) {
			return new ResponseEntity<String>("Addede",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("not added",HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
