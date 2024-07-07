package com.example.academy.service.inter;

import com.example.academy.dto.request.AnswerCreateRequestDto;
import com.example.academy.entity.Answer;

public interface AnswerService {
    Answer create(AnswerCreateRequestDto answerCreateRequestDto);
}
