package com.gomugomu.ma_java_avancee_projet_backend.subject;

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
@RequestMapping("/subject")
public class SubjectController {

  @Autowired
  private SubjectService subjectService;

  @GetMapping("")
  public ResponseEntity<List<Subject>> getAllSubjects() {
    List<Subject> subjects = subjectService.getAllSubjects();
    return ResponseEntity.ok(subjects);
  }

  @PostMapping("")
  public ResponseEntity<Subject> createParenthood(@RequestBody Subject subject) {
    Subject createdSubject = subjectService.createSector(subject);
    return new ResponseEntity<>(createdSubject, HttpStatus.CREATED);
  }
}