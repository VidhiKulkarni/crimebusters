package com.nighthawk.spring_portfolio.mvc.questions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // Scans Application for ModelInit Bean, this detects CommandLineRunner

public class QuizInit {
    @Autowired QuizRepository repository;
    
    /* NOTE: TEMP COMMENT OUT 
    @Bean
    CommandLineRunner run() {  // The run() method will be executed after the application starts
        return args -> {
            // Fail safe data validations

            // starting jokes
            final String[] quizArray = {
                "What are some possible reasons crimes may go unreported?",
                "Out of the following choices, which would be considered suspicious activity?",
                "What should you do if a gun is pointed at you and the criminal asks you to give up your belongings?"
            };

            // make sure Joke database is populated with starting jokes
            for (String question : quizArray) {
                List<Quiz> test = repository.findByQuestionIgnoreCase(question);  // JPA lookup
                if (test.size() == 0)
                    repository.save(new Quiz(null, question, null)); //JPA save

            }
            
        };
    }
    */ 
}

