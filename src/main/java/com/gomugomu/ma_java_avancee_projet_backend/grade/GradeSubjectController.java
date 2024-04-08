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
@RequestMapping("/gradeSubject")
public class GradeSubjectController {

  @Autowired
  private GradeSubjectService gradeSubjectService;

  @GetMapping("")
  public ResponseEntity<List<GradeSubject>> getAllGradeSubjects() {
    List<GradeSubject> gradeSubject = gradeSubjectService.getAllGradeSubjects();
    return ResponseEntity.ok(gradeSubject);
  }

  @PostMapping("")
  public ResponseEntity<GradeSubject> createGradeSubject(@RequestBody GradeSubject gradeSubject) {
    GradeSubject createdGradeSubject = gradeSubjectService.createGradeSubject(gradeSubject);
    return new ResponseEntity<>(createdGradeSubject, HttpStatus.CREATED);
  }
}