package com.bridgelabz.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Country con=context.getBean(Country.class);
		
		con.disp();

	}

}
