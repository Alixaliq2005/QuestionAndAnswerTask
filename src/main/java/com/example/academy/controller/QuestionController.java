package com.example.academy.controller;

import com.example.academy.dto.response.QuestionWithAnswerResponse;
import com.example.academy.service.inter.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
@Validated
@Slf4j
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<QuestionWithAnswerResponse>> readInfo(){
        return ResponseEntity.ok (questionService.readInfo ());
    }


}
