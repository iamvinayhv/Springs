package com.bridgelabz.Employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.Employee.model.Employee;
import com.bridgelabz.Employee.service.EmployeeService;

@Controller
public class ServletController {
	
	@Autowired
	private EmployeeService  employeeService;

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value="/register")
	public ModelAndView register(Employee employee) {
		employeeService.saveEmployee(employee);
		System.out.println(employee.toString());
		return new ModelAndView("regComplete");
	}
	
	
	@RequestMapping(value="/login")
	public String login() {
		return "logComplete";
	}
}
