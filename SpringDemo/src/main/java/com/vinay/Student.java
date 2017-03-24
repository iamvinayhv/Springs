package com.vinay;

import org.springframework.beans.factory.BeanFactory;

public class Student {

	private String name;
	private int age;
	
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	


	public void display(){  
	    System.out.println("Hello: "+name+" age:"+age);  
	}  	
	
}
