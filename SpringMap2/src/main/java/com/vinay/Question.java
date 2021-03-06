package com.vinay;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	private Map<User,Answer> answers;
	
	
	public Question(int id, String question, Map<User, Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	
	void disp()
	{
		System.out.println(id+", "+question);
		System.out.println("answers::\n");
		
		Set<Entry<User,Answer>>an=answers.entrySet();
		Iterator i=an.iterator();
		while(i.hasNext())
		{
			Entry<User,Answer>en=(Entry<User, Answer>) i.next();
			System.out.println("posted by"+en.getKey());
			System.out.println(en.getValue());
			System.out.println("-----------------------");
		}
	}
	
}
