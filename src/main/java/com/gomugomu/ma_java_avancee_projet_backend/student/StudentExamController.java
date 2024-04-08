package com.gomugomu.ma_java_avancee_projet_backend.student;

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
@RequestMapping("/studentExam")
public class StudentExamController {

  @Autowired
  private StudentExamService studentExamService;

  @GetMapping("")
  public ResponseEntity<List<StudentExam>> getAllTeacherExams() {
    List<StudentExam> studentExams = studentExamService.getAllStudentExams();
    return ResponseEntity.ok(studentExams);
  }

  @PostMapping("")
  public ResponseEntity<StudentExam> createParenthood(@RequestBody StudentExam studentExam) {
    StudentExam createdStudentExam = studentExamService.createStudentExam(studentExam);
    return new ResponseEntity<>(createdStudentExam, HttpStatus.CREATED);
  }
}