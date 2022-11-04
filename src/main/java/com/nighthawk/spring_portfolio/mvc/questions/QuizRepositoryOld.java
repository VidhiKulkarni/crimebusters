package com.nighthawk.spring_portfolio.mvc.questions;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizRepositoryOld extends JpaRepository<QuizOld, Long> {
    void save(String Question);
    List<QuizOld> findAllByOrderByQuestionAsc();
    List<QuizOld> findByQuestionIgnoreCase(String name);
}


