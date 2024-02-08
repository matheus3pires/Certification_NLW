package com.pires.certification_nlw.modules.students.dto;

import com.pires.certification_nlw.modules.questions.dto.QuestionResultDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentCertificationAnswerDTO {

    private String email;
    private String technology;
    private List<QuestionAnswerDTO> questionsAnswers;

}
