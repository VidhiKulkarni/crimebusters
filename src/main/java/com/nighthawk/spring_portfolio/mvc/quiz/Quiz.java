package com.nighthawk.spring_portfolio.mvc.quiz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity // Annotation to simplify creating an entity, which is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String quiz; 

    private int choiceA;
    private int choiceB; 
    private int choiceC;
    private int choiceD;

    public Quiz(Long id, String quiz, int choiceA, int choiceB, int choiceC, int choiceD) {
        this.id = id; 
        this.quiz = quiz;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
    }

    public Quiz() {
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return quiz; 
    }

    public void setQuestion(String question) {
        this.quiz = question;
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

    public int getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(int choiceC) {
        this.choiceC = choiceC; 
    }

    public int getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(int choiceD) {
        this.choiceD = choiceD; 
    }



    
}
