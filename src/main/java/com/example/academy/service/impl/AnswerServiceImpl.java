package com.example.academy.service.impl;

import com.example.academy.dto.request.AnswerCreateRequestDto;
import com.example.academy.entity.Answer;
import com.example.academy.repository.AnswerRepository;
import com.example.academy.repository.QuestionRepository;
import com.example.academy.service.inter.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;

    public Answer create(AnswerCreateRequestDto answerCreateRequestDto) {
        Answer answer = Answer.builder()
                .description(answerCreateRequestDto.getDescription())
                .isCorrect(answerCreateRequestDto.getIsCorrect())
                .build();
        answer.setQuestion(questionRepository.findById(answerCreateRequestDto.getQuestionId()).orElseThrow ());
        return answerRepository.save(answer);
    }
}
