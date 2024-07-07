package com.example.academy.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnswerCreateRequestDto {

    @NotBlank(message = "description is important")
    String description;

    Boolean isCorrect;
    @NotBlank(message = "questionId is important")
    Long questionId;
}
