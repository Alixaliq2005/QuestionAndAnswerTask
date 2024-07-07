package com.example.academy.controller;

import com.example.academy.dto.request.AnswerCreateRequestDto;
import com.example.academy.entity.Answer;
import com.example.academy.service.inter.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerService answerService;


    @PostMapping("/create")
    public ResponseEntity<Answer> createAnswer(@RequestBody AnswerCreateRequestDto answerCreateRequestDto) {
        Answer createdAnswer = answerService.create(answerCreateRequestDto);
        return ResponseEntity.ok(createdAnswer);
    }

}
