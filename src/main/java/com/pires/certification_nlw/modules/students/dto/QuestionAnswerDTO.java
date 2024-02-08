package com.pires.certification_nlw.modules.students.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswerDTO {

    private UUID questionID;
    private UUID alternativeID;
    private boolean isCorrect;
}
