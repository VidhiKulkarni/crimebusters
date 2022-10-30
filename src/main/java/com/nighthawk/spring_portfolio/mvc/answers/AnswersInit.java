package com.nighthawk.spring_portfolio.mvc.answers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // Scans Application for ModelInit Bean, this detects CommandLineRunner
public class AnswersInit {
    
    // Inject repositories
    @Autowired AnswersJpaRepository repository;
     //NOTE: COMMENT OUT TO FIX AN ERROR
    @Bean
    CommandLineRunner run() {  // The run() method will be executed after the application starts
        return args -> {
            // Fail safe data validations

            // starting jokes
            final String[] jokesArray = {
                "What are some possible reasons crimes may go unreported?\nA.",
                "Out of the following choices, which would be considered suspicious activity?",
                "What should you do if a gun is pointed at you and the criminal asks you to give up your belongings?"
            };
            // testing out crimebusters quiz backend

            // make sure Joke database is populated with starting jokes
            for (String joke : jokesArray) {
                List<Answers> test = repository.findByJokeIgnoreCase(joke);  // JPA lookup
                if (test.size() == 0)
                repository.save(new Answers(null, joke, 0, 0)); //JPA save
                    
            }
            
        };
        
    }
    
}

