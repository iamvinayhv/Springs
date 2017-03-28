package com.vinay;

import java.util.List;

public class Answer {

	private int id;
	private List <String>answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answers=" + answers + "]";
	}
	
	
	
}
