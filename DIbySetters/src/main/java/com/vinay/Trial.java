package com.vinay;

public class Trial {

	
	private Employee employee;
	private Address address;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void disp()
	{
		System.out.println(employee);
		System.out.println(address);
	}
	
}
