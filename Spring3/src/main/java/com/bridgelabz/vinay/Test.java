package com.bridgelabz.vinay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("question.xml");
		Question q=context.getBean(Question.class);
		
		q.disp();

	}

}