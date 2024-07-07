package com.example.academy.repository;

import com.example.academy.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, String>,
        JpaSpecificationExecutor<Answer> {
    @Query("""
            select a from  Answer a  where a.id=:id order by RAND()
            """)
    List<Answer> findByQuestionByRandom(Long id);

    @Query("""
            SELECT a FROM Answer a WHERE a.question.id = :questionId AND a.isCorrect = true
            """)
    List<Answer> findCorrectAnswersByQuestionId(String questionId);
}
