package com.bridgelabz.Anotation;

public class Address {

	private String city;
	private String country;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public void disp()
	{
		System.out.println("\nAddress\nEmp.city=" +city + "\nEmp.Country:="+country);
	}
}
