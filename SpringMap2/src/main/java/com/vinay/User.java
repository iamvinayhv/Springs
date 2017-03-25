package com.vinay;

public class User {

	private String name;
	private String date;
	
	
	public User(String name, String date) {

		this.name = name;
		this.date = date;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", date=" + date + "]";
	}
	
	
	
}
