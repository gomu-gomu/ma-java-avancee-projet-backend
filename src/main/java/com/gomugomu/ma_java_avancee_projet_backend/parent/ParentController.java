package com.gomugomu.ma_java_avancee_projet_backend.parent;

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
@RequestMapping("/parent")
public class ParentController {

  @Autowired
  private ParentService parentService;

  @GetMapping("")
  public ResponseEntity<List<Parent>> getAllStudents() {
    List<Parent> students = parentService.getAllParents();
    return ResponseEntity.ok(students);
  }

  @PostMapping("")
  public ResponseEntity<Parent> createStudents(@RequestBody Parent parent) {
    Parent createdParent = parentService.createParent(parent);
    return new ResponseEntity<>(createdParent, HttpStatus.CREATED);
  }
}