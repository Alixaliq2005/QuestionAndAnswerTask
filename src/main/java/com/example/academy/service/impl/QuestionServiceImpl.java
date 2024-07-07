package com.example.academy.service.impl;

import com.example.academy.dto.response.AnswerListResponseDto;
import com.example.academy.dto.response.QuestionWithAnswerResponse;
import com.example.academy.entity.Answer;
import com.example.academy.entity.Question;
import com.example.academy.repository.AnswerRepository;
import com.example.academy.repository.QuestionRepository;
import com.example.academy.service.inter.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

     public List<QuestionWithAnswerResponse> readInfo() {
         List<Question> questions;
         questions = questionRepository.findRandomQuestions ();

         List<QuestionWithAnswerResponse> questionWithAnswerResponses = new ArrayList<> ();
         for (Question question : questions) {
             QuestionWithAnswerResponse answerResponse = new QuestionWithAnswerResponse ();
             answerResponse.setDescription (question.getDescription ());
             answerResponse.setQuestionType (question.getQuestionType ());


             List<Answer> answers = answerRepository.findByQuestionByRandom (Long.valueOf (question.getId ()));
             List<AnswerListResponseDto> answerListResponses= new ArrayList<> ();
             for (Answer answer: answers){
                 AnswerListResponseDto answerListResponse= AnswerListResponseDto.builder ()
                         .id (answer.getId ())
                         .description (answer.getDescription ())
                         .build ();
             answerListResponses.add(answerListResponse);
             }
             answerResponse.setAnswers (answerListResponses);
             answerResponse.setId (question.getId ());
             questionWithAnswerResponses.add (answerResponse);

         }
         return questionWithAnswerResponses;
     }
}
