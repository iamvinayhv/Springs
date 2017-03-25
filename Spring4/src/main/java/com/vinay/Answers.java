package com.vinay;

public class Answers {

	private int id;
	private String answer;
	private String by;
	
	
	public Answers(int id, String answer, String by) {

		this.id = id;
		this.answer = answer;
		this.by = by;
	}


	@Override
	public String toString() {
		return "Answers [id=" + id + ", answer=" + answer + ", by=" + by + "]";
	}
	
	
	
}
