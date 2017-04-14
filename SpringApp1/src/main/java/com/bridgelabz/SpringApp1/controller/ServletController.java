package com.bridgelabz.SpringApp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class ServletController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

}
