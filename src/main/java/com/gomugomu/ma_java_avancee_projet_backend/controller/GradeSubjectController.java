package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.GradeSubject;
import com.gomugomu.ma_java_avancee_projet_backend.service.GradeSubjectService;



@RestController
public class GradeSubjectController {

  private final GradeSubjectService gradeSubjectService;

  @Autowired
  public GradeSubjectController(GradeSubjectService GradeSubjectService) {
    this.gradeSubjectService = GradeSubjectService;
  }

  @GetMapping("/gradeSubjects")
    public ResponseEntity<List<GradeSubject>> getAllGradeSubjects() {
      List<GradeSubject> gradeSubject = gradeSubjectService.getAllGradeSubjects();
      return ResponseEntity.ok(gradeSubject);
  }

  @PostMapping("/gradeSubject")
  public ResponseEntity<GradeSubject> createGradeSubject(@RequestBody GradeSubject gradeSubject) {
    GradeSubject createdGradeSubject = gradeSubjectService.createGradeSubject(gradeSubject);
    return new ResponseEntity<>(createdGradeSubject, HttpStatus.CREATED);
  }
}