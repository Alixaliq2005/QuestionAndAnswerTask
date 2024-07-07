package com.example.academy.repository;

import com.example.academy.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long>, JpaSpecificationExecutor<Question> {


    @Query("""
            select q from Question q ORDER BY RAND()
            limit 10
            """)
    List<Question> findRandomQuestions();
}
