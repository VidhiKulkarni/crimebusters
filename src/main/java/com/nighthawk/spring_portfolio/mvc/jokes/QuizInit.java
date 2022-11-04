package com.nighthawk.spring_portfolio.mvc.jokes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // Scans Application for ModelInit Bean, this detects CommandLineRunner
public class QuizInit {
    
    // Inject repositories
    @Autowired QuizJpaRepository repository;
     //NOTE: COMMENT OUT TO FIX AN ERROR
    @Bean
    CommandLineRunner run() {  // The run() method will be executed after the application starts
        return args -> {
            // Fail safe data validations

            // starting jokes
            final String[] quizArray = {
                "What are some possible reasons crimes may go unreported?",
                "What should you do in the case someone breaks into your house?",
                "Out of the following choices, which would be considered suspicious activity?",
                "What should you do if a gun is pointed at you and the criminal asks you to give up your belongings?"
            };

            // make sure Joke database is populated with starting jokes
            for (String quiz : quizArray) {
                List<Quiz> test = repository.findByQuizIgnoreCase(quiz);  // JPA lookup
                if (test.size() == 0)
                repository.save(new Quiz(null, quiz, 0, 0, 0, 0)); //JPA save
                    
            }
            
        };
        
    }

}

