package com.bridgelabz.Anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emploee {

	private int id;
	private String name;
	@Autowired
	private Address address;

	
	
	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	
	public void display() {
		System.out.println("Id:"+id+",\nName:"+name);
		address.disp();
	}
}
