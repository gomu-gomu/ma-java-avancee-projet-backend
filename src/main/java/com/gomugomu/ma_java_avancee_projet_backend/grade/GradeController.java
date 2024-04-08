package com.gomugomu.ma_java_avancee_projet_backend.grade;

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
@RequestMapping("/grade")
public class GradeController {

  @Autowired
  private GradeService classService;

  @GetMapping("")
  public ResponseEntity<List<Grade>> getAllGrades() {
    List<Grade> grades = classService.getAllGrades();
    return ResponseEntity.ok(grades);
  }

  @PostMapping("")
  public ResponseEntity<Grade> createParenthood(@RequestBody Grade grade) {
    Grade createdGrade = classService.createClass(grade);
    return new ResponseEntity<>(createdGrade, HttpStatus.CREATED);
  }
}