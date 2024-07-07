package com.example.academy.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String description;

    Boolean isCorrect;

    @Getter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "question_id",referencedColumnName = "id")
    Question question;

    @PrePersist
    private void prePersist(){
        if(isCorrect==null){
            isCorrect=false;
        }
    }


}
