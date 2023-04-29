package com.prashant.poc.openapitool.controller;

import com.prashant.poc.openapitool.models.Student;
import com.prashant.poc.openapitool.models.StudentsPage;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class StudentsApiDelegateImpl implements StudentsApiDelegate {

    @Override
    public ResponseEntity<StudentsPage> listStudents() {
            return ResponseEntity.ok(studentsPageModel());
    }

    private StudentsPage studentsPageModel() {
        return StudentsPage.builder()
            .total(new BigDecimal(1))
            .students(List.of(student()))
            .build();
    }

    private Student student() {
        return Student.builder()
            .name("John Doe")
            .city("India")
            .email("john.doe@email.com")
            .phone("9999999999")
            .build();
    }
}
