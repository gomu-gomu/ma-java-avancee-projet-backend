package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Class;
import com.gomugomu.ma_java_avancee_projet_backend.service.ClassService;



@RestController
public class ClassController {

  private final ClassService classService;

  @Autowired
  public ClassController(ClassService classService) {
    this.classService = classService;
  }

  @GetMapping("/classes")
    public ResponseEntity<List<Class>> getAllClasses() {
      List<Class> classes = classService.getAllClasses();
      return ResponseEntity.ok(classes);
  }

  @PostMapping("/class")
  public ResponseEntity<Class> createParenthood(@RequestBody Class classObj) {
    Class createdClass = classService.createClass(classObj);
    return new ResponseEntity<>(createdClass, HttpStatus.CREATED);
  }
}