package com.qa.data;

public class Answers {
	
	private String answer;
	
	// next question link based on answers
	private Question nextQuestion;
	
	
	public Answers(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getNextQuestion() {
		return nextQuestion;
	}

	public void setNextQuestion(Question nextQuestion) {
		this.nextQuestion = nextQuestion;
	}
	
	
	
}
