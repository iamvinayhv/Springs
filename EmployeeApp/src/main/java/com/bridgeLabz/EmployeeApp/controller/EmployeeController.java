package com.bridgeLabz.EmployeeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeLabz.EmployeeApp.model.Employee;
import com.bridgeLabz.EmployeeApp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/*@RequestMapping(value= "/")
	public String welcome() {
		return "welcome";
	}*/

	@RequestMapping(value = "register")
	public ModelAndView register(Employee employee) {
		
		Employee result;
		
		result=employeeService.alreadyReg(employee.getMail());
		
		if(result == null) {
			
			employeeService.saveEmployee(employee);
			return new ModelAndView("regComplete");
		}
		else {
			return new ModelAndView("alreadyReg");
		}
		
		
		
	}

	@RequestMapping(value = "login")
	public ModelAndView login(@RequestParam("mail") String mail, @RequestParam("password") String password) {

			Employee employee = employeeService.authUser(mail, password);
			
			if (employee == null) {
				
				return new ModelAndView("loginError");
				
			} 
			else {
				ModelAndView model = new ModelAndView("loginComplete");
				model.addObject("employee", employee);
				return model;
			}
		
	}
	
	@RequestMapping(value = "users")
	public ModelAndView users() {
		
		List users=employeeService.users();
		System.out.println("hail   "+users.toString());
		
		if(users != null) {
			
			ModelAndView modelAndView=new ModelAndView("users");
			modelAndView.addObject("users",users);
			
			return modelAndView;
		}
		
		return new ModelAndView("nouser");
		
	}
	
	@RequestMapping(value = "update")
	public ModelAndView update() {
		return null;
		
	}
	
	@RequestMapping(value = "/changepassword")
	public ModelAndView changePassword(@RequestParam("mail") String mail,@RequestParam("oldpassword") String oldpassword ,@RequestParam("newpassword") String newpassword, @RequestParam("reEnter") String reEnter) {
		
		if(newpassword.equals(reEnter)) {
			System.out.println("hai");
			
			Employee employee=employeeService.authUser(mail,oldpassword);
			
			System.out.println("bteeee");
			
			if(employee != null) {
				
				int resul = employeeService.changePassword(mail,newpassword);
				if(resul>0)
					return new ModelAndView("passwordChanged");
				else
					return new ModelAndView("Error");
			}
			else {
				return new ModelAndView("changepassword");
			}
			
		}
		else {
			return new ModelAndView("passwordError");
		}
		
	}
}
