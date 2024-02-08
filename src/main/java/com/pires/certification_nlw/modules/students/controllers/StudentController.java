package com.pires.certification_nlw.modules.students.controllers;

import com.pires.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.pires.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.pires.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.pires.certification_nlw.modules.students.useCases.StudentCertificationAnswersUseCase;
import com.pires.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @Autowired
    private StudentCertificationAnswersUseCase studentCertificationAnswersUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        // Email
        // Technology
        var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
        if (result){
            return "Usuário ja fez a prova";
        }
        return "Usuário pode fazer a prova";
    }

    @PostMapping("/certification/answer")
    public ResponseEntity<Object> certificationAnswer(@RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO) {
        try {
            var result = studentCertificationAnswersUseCase.execute(studentCertificationAnswerDTO);
            return ResponseEntity.ok().body(result);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
