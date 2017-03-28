package com.bridgelabz.App;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private String contName;
	@Autowired
	private Capital capital;
	
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	public void disp()
	{
		System.out.println(capital.getCapName()+" is capital of "+contName);
	}
}
