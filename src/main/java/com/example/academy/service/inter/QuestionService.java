package com.example.academy.service.inter;

import com.example.academy.dto.response.QuestionWithAnswerResponse;

import java.util.List;

public interface QuestionService {
    List<QuestionWithAnswerResponse> readInfo();
}


