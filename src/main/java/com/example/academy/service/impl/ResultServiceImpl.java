package com.example.academy.service.impl;

import com.example.academy.dto.request.ResultRequestDto;
import com.example.academy.entity.Answer;
import com.example.academy.repository.AnswerRepository;
import com.example.academy.service.inter.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ResultServiceImpl implements ResultService {

    private final AnswerRepository answerRepository;

    @Override
    public double getResultPercentage(List<ResultRequestDto> resultRequestDto) {
        int questionCount = 10;

        return resultRequestDto.stream ()
                .mapToDouble (this::calculateQuestionPoints)
                .sum () / questionCount * 100;
    }

    private double calculateQuestionPoints(ResultRequestDto resultRequestDto) {
        List<Answer> correctAnswersId = getCorrectAnswersId (resultRequestDto);
        List<String> usersAnswers = resultRequestDto.getAnswers ();
        String questionType = String.valueOf (resultRequestDto.getQuestionResultRequestDto ().getQuestionType ());

        if (questionType.equals ("MULTI")) {
            double correctChoicePoints = 1.0 / correctAnswersId.size ();
            return usersAnswers.stream ()
                    .filter (correctAnswersId::contains)
                    .count () * correctChoicePoints;
        }
        else {
            return correctAnswersId.equals (usersAnswers) ? 1:0;
        }
    }

    private List<Answer> getCorrectAnswersId(ResultRequestDto resultRequestDto) {
        Long questionId=resultRequestDto.getQuestionResultRequestDto().getId ();
        return answerRepository.findCorrectAnswersByQuestionId(questionId);
    }


}
