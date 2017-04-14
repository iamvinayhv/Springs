package com.bridgeLabz.LoginRegApp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.LoginRegApp.model.Customer;
import com.bridgeLabz.LoginRegApp.service.CustomerLogService;

@RestController
public class CustomerLoginConntroller {
	
	public CustomerLoginConntroller() {	}
	
	@Autowired
	private CustomerLogService customerLogService;

	@RequestMapping(value="login", method=RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody Map<String,String>loginMap ,HttpServletRequest request,HttpServletResponse response) {
	
		Customer customer =  customerLogService.login(loginMap.get("email"),loginMap.get("password"));
		if(customer != null) {
			return new ResponseEntity<String>("login completed",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("login failed",HttpStatus.NOT_ACCEPTABLE);
		}
	}
}