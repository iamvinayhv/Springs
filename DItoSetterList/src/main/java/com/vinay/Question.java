package com.vinay;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;

	private List<Answer>answers;
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void disp()
	{
		System.out.println(id+", "+question);
		
		Iterator<Answer>i=answers.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
