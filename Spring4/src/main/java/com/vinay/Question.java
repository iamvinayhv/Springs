package com.vinay;

import java.util.Iterator;
import java.util.List;

/**
 * This is a simple example of Spring Constructor Injection
 * @author vinay
 *@since 2017-03-25
 */
public class Question {

	private String id;
	private String question;
	private List<Answers> answers;
	
	
	
	public Question(String id, String question, List<Answers> answers) {

		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	
	
	
	public void disp() {
		
		System.out.println(id+" "+question);
		System.out.println("Answers ::");
		
		Iterator<Answers> i=answers.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}
}
