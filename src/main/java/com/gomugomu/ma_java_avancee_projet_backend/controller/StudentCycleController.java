package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.StudentCycle;
import com.gomugomu.ma_java_avancee_projet_backend.service.StudentCycleService;



@RestController
public class StudentCycleController {

  private final StudentCycleService studentCycleService;

  @Autowired
  public StudentCycleController(StudentCycleService studentCycleService) {
    this.studentCycleService = studentCycleService;
  }

  @GetMapping("/studentCycles")
    public ResponseEntity<List<StudentCycle>> getAllTeacherCycles() {
      List<StudentCycle> studentCycles = studentCycleService.getAllStudentCycles();
      return ResponseEntity.ok(studentCycles);
  }

  @PostMapping("/studentCycle")
  public ResponseEntity<StudentCycle> createParenthood(@RequestBody StudentCycle studentCycle) {
    StudentCycle createdStudentCycle = studentCycleService.createStudentCycle(studentCycle);
    return new ResponseEntity<>(createdStudentCycle, HttpStatus.CREATED);
  }
}