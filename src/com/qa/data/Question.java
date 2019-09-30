package com.qa.data;

import java.util.List;

public class Question {
	private String question;
	
	//# TODO Enum in future
	private String type;
	
	List<Answers> answers;
	
	public Question(String question, String type) {
		super();
		this.question = question;
		this.type = type;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
