package com.gomugomu.ma_java_avancee_projet_backend.exam;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/exam")
public class ExamController {

  @Autowired
  private ExamService examService;

  @GetMapping("")
  public ResponseEntity<List<Exam>> getAllExams() {
    List<Exam> exams = examService.getalleExams();
    return ResponseEntity.ok(exams);
  }

  @PostMapping("")
  public ResponseEntity<Exam> createParenthood(@RequestBody Exam exam) {
    Exam createdCycle = examService.createExam(exam);
    return new ResponseEntity<>(createdCycle, HttpStatus.CREATED);
  }
}