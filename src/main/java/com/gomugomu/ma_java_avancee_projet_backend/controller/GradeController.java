package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Grade;
import com.gomugomu.ma_java_avancee_projet_backend.service.GradeService;



@RestController
public class GradeController {

  private final GradeService classService;

  @Autowired
  public GradeController(GradeService gradeService) {
    this.classService = gradeService;
  }

  @GetMapping("/grades")
    public ResponseEntity<List<Grade>> getAllGrades() {
      List<Grade> grades = classService.getAllGrades();
      return ResponseEntity.ok(grades);
  }

  @PostMapping("/grade")
  public ResponseEntity<Grade> createParenthood(@RequestBody Grade grade) {
    Grade createdGrade = classService.createClass(grade);
    return new ResponseEntity<>(createdGrade, HttpStatus.CREATED);
  }
}