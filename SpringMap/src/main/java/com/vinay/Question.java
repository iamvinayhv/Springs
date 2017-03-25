package com.vinay;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	private Map<String,String> answer;
	
	
	public Question(int id, String question, Map<String, String> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	
	public void disp()
	{
		System.out.println(id+", "+question);
		System.out.println("Answers::");
		
		Set<Entry<String,String>>ans=answer.entrySet();
		
		Iterator<Entry<String, String>> i=ans.iterator();
		
		System.out.println("Answers are::");
		while(i.hasNext())
		{ 
			Entry<String,String> ans1=i.next();
			System.out.println("Answer:"+ans1.getKey()+", "+ans1.getValue());
			
		}
	}
	
}