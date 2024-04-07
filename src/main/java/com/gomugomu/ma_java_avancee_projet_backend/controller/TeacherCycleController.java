package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.TeacherCycle;
import com.gomugomu.ma_java_avancee_projet_backend.service.TeacherCycleService;



@RestController
public class TeacherCycleController {

  private final TeacherCycleService teacherCycleService;

  @Autowired
  public TeacherCycleController(TeacherCycleService teacherCycleService) {
    this.teacherCycleService = teacherCycleService;
  }

  @GetMapping("/teacherCycles")
    public ResponseEntity<List<TeacherCycle>> getAllTeacherCycles() {
      List<TeacherCycle> teacherCycles = teacherCycleService.getAllTeacherCycles();
      return ResponseEntity.ok(teacherCycles);
  }

  @PostMapping("/teacherCycle")
  public ResponseEntity<TeacherCycle> createParenthood(@RequestBody TeacherCycle teacherCycle) {
    TeacherCycle createdTeacherCycle = teacherCycleService.createTeacherCycle(teacherCycle);
    return new ResponseEntity<>(createdTeacherCycle, HttpStatus.CREATED);
  }
}