package com.bridgelabz.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.DemoA;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		DemoA a=(DemoA) context.getBean("j");
		
		a.disp();
	}

}
