package com.example.academy.dto.response;

import com.example.academy.entity.QuestionType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class QuestionWithAnswerResponse {

    String id;

    String description;

    QuestionType questionType;

    List<AnswerListResponseDto> answers;
}
