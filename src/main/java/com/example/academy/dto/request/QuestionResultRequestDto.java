package com.example.academy.dto.request;

import com.example.academy.dto.response.AnswerListResponseDto;
import com.example.academy.entity.QuestionType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuestionResultRequestDto {
    Long id;
    String description;
    QuestionType questionType;

    List<AnswerListResponseDto> answers;
}
