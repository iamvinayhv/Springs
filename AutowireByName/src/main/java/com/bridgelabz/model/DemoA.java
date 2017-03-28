package com.bridgelabz.model;

public class DemoA {

	private DemoB c;
	
	public DemoA() {

		System.out.println("DemoA created");
	}

	public DemoB getB() {
		return c;
	}

	public void setB(DemoB b) {
		this.c = b;
	}
	
	void print() {
		System.out.println("hi a");
	}
	
	public void disp()
	{
		print();
		c.print();
	}
	
}
