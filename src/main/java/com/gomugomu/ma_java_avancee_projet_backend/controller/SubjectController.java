package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Subject;
import com.gomugomu.ma_java_avancee_projet_backend.service.SubjectService;



@RestController
public class SubjectController {

  private final SubjectService subjectService;

  @Autowired
  public SubjectController(SubjectService subjectService) {
    this.subjectService = subjectService;
  }

  @GetMapping("/subjects")
    public ResponseEntity<List<Subject>> getAllSubjects() {
      List<Subject> subjects = subjectService.getAllSubjects();
      return ResponseEntity.ok(subjects);
  }

  @PostMapping("/subject")
  public ResponseEntity<Subject> createParenthood(@RequestBody Subject subject) {
    Subject createdSubject = subjectService.createSector(subject);
    return new ResponseEntity<>(createdSubject, HttpStatus.CREATED);
  }
}