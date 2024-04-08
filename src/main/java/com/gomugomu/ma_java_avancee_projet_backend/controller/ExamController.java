package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Exam;
import com.gomugomu.ma_java_avancee_projet_backend.service.ExamService;



@RestController
public class ExamController {

  private final ExamService examService;

  @Autowired
  public ExamController(ExamService examService) {
    this.examService = examService;
  }

  @GetMapping("/exams")
    public ResponseEntity<List<Exam>> getAllExams() {
      List<Exam> exams = examService.getalleExams();
      return ResponseEntity.ok(exams);
  }

  @PostMapping("/exam")
  public ResponseEntity<Exam> createParenthood(@RequestBody Exam exam) {
    Exam createdCycle = examService.createExam(exam);
    return new ResponseEntity<>(createdCycle, HttpStatus.CREATED);
  }
}