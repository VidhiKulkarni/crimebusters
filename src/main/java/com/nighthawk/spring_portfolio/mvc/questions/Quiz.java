package com.nighthawk.spring_portfolio.mvc.questions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @Column(unique=true)
    private String question; 
    private String answer; 

    private int choiceA;
    private int choiceB; 

    public Quiz(Long id, String question, String answer) {
        this.id = id; 
        this.question = question;
        this.answer = answer;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
    }

    public Quiz() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question; 
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer; 
    }

    public int getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(int choiceA) {
        this.choiceA = choiceA; 
    }

    public int getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(int choiceB) {
        this.choiceB = choiceB; 
    }
}
