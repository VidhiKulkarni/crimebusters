package com.nighthawk.spring_portfolio.mvc.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/quiz")  // all requests in file begin with this URI
public class QuizApiController {

    // Autowired enables Control to connect URI request and POJO Object to easily for Database CRUD operations
    @Autowired
    private QuizJpaRepository repository;

    /* GET List of Quiz
     * @GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping("/")
    public ResponseEntity<List<Quiz>> getQuiz() {
        // ResponseEntity returns List of Quiz provide by JPA findAll()
        return new ResponseEntity<>( repository.findAll(), HttpStatus.OK);
    }

    /* Update choiceA
     * @PutMapping annotation is used for mapping HTTP PUT requests onto specific handler methods.
     * @PathVariable annotation extracts the templated part {id}, from the URI
     */
    @PutMapping("/choiceA/{id}")
    public ResponseEntity<Quiz> setchoiceA(@PathVariable long id) {
        /* 
        * Optional (below) is a container object which helps determine if a result is present. 
        * If a value is present, isPresent() will return true
        * get() will return the value.
        */
        Optional<Quiz> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Quiz quiz = optional.get();  // value from findByID
            quiz.setChoiceA(quiz.getChoiceA()+1); // increment value
            repository.save(quiz);  // save entity
            return new ResponseEntity<>(quiz, HttpStatus.OK);  // OK HTTP response: status code, headers, and body
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);  // Failed HTTP response: status code, headers, and body
    }

    /* Update choiceB
     */
    @PutMapping("/choiceB/{id}")
    public ResponseEntity<Quiz> setChoiceB(@PathVariable long id) {
        Optional<Quiz> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Quiz quiz = optional.get();
            quiz.setChoiceB(quiz.getChoiceB()+1);
            repository.save(quiz);
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    // Update choiceC
    @PutMapping("/choiceC/{id}")
    public ResponseEntity<Quiz> setChoiceC(@PathVariable long id) {
        Optional<Quiz> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Quiz quiz = optional.get();
            quiz.setChoiceC(quiz.getChoiceC()+1);
            repository.save(quiz);
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
    // Update choiceD
    @PutMapping("/choiceD/{id}")
    public ResponseEntity<Quiz> setChoiceD(@PathVariable long id) {
        Optional<Quiz> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Quiz quiz = optional.get();
            quiz.setChoiceD(quiz.getChoiceD()+1);
            repository.save(quiz);
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
