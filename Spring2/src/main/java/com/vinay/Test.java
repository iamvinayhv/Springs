package com.vinay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		
		Employee emp=context.getBean(Employee.class);
		
		emp.show();
	}

}
