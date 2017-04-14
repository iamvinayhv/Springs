 package com.bridgelabz.framework.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.Anotation.Emploee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Emploee emp=context.getBean(Emploee.class);
		emp.display();
	}
}
