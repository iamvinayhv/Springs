package com.vinay;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());
	}
	
	
}