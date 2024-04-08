package com.gomugomu.ma_java_avancee_projet_backend.cycle;

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
@RequestMapping("/studentCycle")
public class StudentCycleController {

  @Autowired
  private StudentCycleService studentCycleService;

  @GetMapping("")
  public ResponseEntity<List<StudentCycle>> getAllTeacherCycles() {
    List<StudentCycle> studentCycles = studentCycleService.getAllStudentCycles();
    return ResponseEntity.ok(studentCycles);
  }

  @PostMapping("")
  public ResponseEntity<StudentCycle> createParenthood(@RequestBody StudentCycle studentCycle) {
    StudentCycle createdStudentCycle = studentCycleService.createStudentCycle(studentCycle);
    return new ResponseEntity<>(createdStudentCycle, HttpStatus.CREATED);
  }
}