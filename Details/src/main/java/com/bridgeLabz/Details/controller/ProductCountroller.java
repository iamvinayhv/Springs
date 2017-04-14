package com.bridgeLabz.Details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.Details.model.Customer;
import com.bridgeLabz.Details.service.ProductService;

@RestController
public class ProductCountroller {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<String> addProduct(@RequestBody Customer customer) {
		
		boolean result  = productService.addProduct(customer);
		
		if(result) {
			return new ResponseEntity<String>("Added",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("not Added",HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	
	@RequestMapping(value="/getProduct/{id}",method=RequestMethod.GET)
	public ResponseEntity<String> getProduct(@PathVariable("id") int id) {
		
		List product = productService.getProduct(id);
		
		if(product != null) {
			return new ResponseEntity<String>("Details of product",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Product not found",HttpStatus.NOT_FOUND);
		}
	}
}
