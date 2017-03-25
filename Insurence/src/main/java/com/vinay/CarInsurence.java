package com.vinay;

public class CarInsurence implements Insurence {

	private String name;
	private Validity va;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public CarInsurence(Validity va) {
		this.va = va;
		System.out.println("validity: "+va.getValidity());
	}

	
	
	public void status()
	{
		System.out.println(name+" your vehicle Insured");
		
	}

	

	
}
