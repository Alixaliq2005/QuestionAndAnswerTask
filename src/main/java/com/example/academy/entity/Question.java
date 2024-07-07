package com.example.academy.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "description",nullable = false)
    String description;


    @Enumerated(EnumType.STRING)
    QuestionType questionType;

    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy = "question")
    List<Answer> answers;

}
