package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Parent;
import com.gomugomu.ma_java_avancee_projet_backend.service.ParentService;



@RestController
public class ParentController {

  private final ParentService parentService;

  @Autowired
  public ParentController(ParentService parentService) {
    this.parentService = parentService;
  }

  @GetMapping("/parents")
    public ResponseEntity<List<Parent>> getAllStudents() {
      List<Parent> students = parentService.getAllParents();
      return ResponseEntity.ok(students);
  }

  @PostMapping("/parent")
  public ResponseEntity<Parent> createStudents(@RequestBody Parent parent) {
    Parent createdParent = parentService.createParent(parent);
    return new ResponseEntity<>(createdParent, HttpStatus.CREATED);
  }
}