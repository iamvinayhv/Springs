package com.bridgeLabz.LoginRegApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.LoginRegApp.model.Customer;
import com.bridgeLabz.LoginRegApp.service.CustomerRegisterService;

@RestController
public class CustomerRegisterController {

	@Autowired
	private CustomerRegisterService customerRegService;
	
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public ResponseEntity<String> addCoust(@RequestBody Customer customer) {
		
		boolean result = customerRegService.addCoust(customer);
		
		if(result) {
			return new ResponseEntity<String>("Registration Completed",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Registration Failed",HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
