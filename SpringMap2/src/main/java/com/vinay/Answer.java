package com.vinay;

public class Answer {

	private int id;
	private String answer;

	public Answer(int id,String answer) {
		super();
		this.id=id;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	
	
}
