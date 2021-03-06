package com.vinay;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	
	private Map<User,Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<User, Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<User, Answer> answers) {
		this.answers = answers;
	}
	
	public void disp()
	{
		System.out.println(id+", "+question);
		
		Set<Entry<User,Answer>>set=answers.entrySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next()					);
		}
	}
	
}
