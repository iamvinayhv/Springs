package com.bridgelabz.vinay;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;
	private List<String> answers;
	
	
	
	public Question() {	}

	
	

	public Question(int id, String question,List<String> answers) {
		
		this.id = id;
		this.question = question;
		this.answers=answers;
	}
	
	
	
	public void disp()
	{
		System.out.println(id+" "+question);
		
		Iterator<String>i=answers.iterator();
		
		System.out.println("Answers Are::");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
