package com.example.examservice.dto;

import com.example.examservice.model.ExamQuizResult;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamQuizQuestionResultDTO {
    private ExamQuizResult examQuizResult;

    private UUID questionId;

    private List<UUID> userAnswer;

    private List<UUID> correctAnswer;

    private Boolean isCorrect;

    private int score;
}
