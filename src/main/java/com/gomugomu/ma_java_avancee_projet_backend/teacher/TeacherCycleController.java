package com.gomugomu.ma_java_avancee_projet_backend.teacher;

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
@RequestMapping("/teacherCycle")
public class TeacherCycleController {

  @Autowired
  private TeacherCycleService teacherCycleService;

  @GetMapping("")
  public ResponseEntity<List<TeacherCycle>> getAllTeacherCycles() {
    List<TeacherCycle> teacherCycles = teacherCycleService.getAllTeacherCycles();
    return ResponseEntity.ok(teacherCycles);
  }

  @PostMapping("")
  public ResponseEntity<TeacherCycle> createParenthood(@RequestBody TeacherCycle teacherCycle) {
    TeacherCycle createdTeacherCycle = teacherCycleService.createTeacherCycle(teacherCycle);
    return new ResponseEntity<>(createdTeacherCycle, HttpStatus.CREATED);
  }
}