package com.bridgelabz.ByType.model;

public class Employee {

	private int id;
	private String name;
	
	private Address address;

	/*public Employee(Address address) {
		this.address=address;
	}*/


	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}


	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void disp() {
		System.out.println("Id:"+id+", Name:"+name);
		System.out.println(address.getCity()+","+address.getCountry());
	}



	
	
}
