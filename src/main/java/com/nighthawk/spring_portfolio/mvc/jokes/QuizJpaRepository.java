package com.nighthawk.spring_portfolio.mvc.jokes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA is an object-relational mapping (ORM) to persistent data, originally relational databases (SQL). Today JPA implementations has been extended for NoSQL.
public interface QuizJpaRepository extends JpaRepository<Quiz, Long> {
    // JPA has many built in methods, these few have been prototyped for this application
    void save(String Quiz);
    List<Quiz> findAllByOrderByQuizAsc();
    List<Quiz> findByQuizIgnoreCase(String quiz);
}
