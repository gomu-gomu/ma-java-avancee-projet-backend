package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.StudentExam;
import com.gomugomu.ma_java_avancee_projet_backend.service.StudentExamService;



@RestController
public class StudentExamController {

  private final StudentExamService studentExamService;

  @Autowired
  public StudentExamController(StudentExamService studentExamService) {
    this.studentExamService = studentExamService;
  }

  @GetMapping("/studentExams")
    public ResponseEntity<List<StudentExam>> getAllTeacherExams() {
      List<StudentExam> studentExams = studentExamService.getAllStudentExams();
      return ResponseEntity.ok(studentExams);
  }

  @PostMapping("/studentExam")
  public ResponseEntity<StudentExam> createParenthood(@RequestBody StudentExam studentExam) {
    StudentExam createdStudentExam = studentExamService.createStudentExam(studentExam);
    return new ResponseEntity<>(createdStudentExam, HttpStatus.CREATED);
  }
}