package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Teacher;
import com.gomugomu.ma_java_avancee_projet_backend.service.TeacherService;



@RestController
public class TeacherController {

  private final TeacherService teacherService;

  @Autowired
  public TeacherController(TeacherService teacherService) {
    this.teacherService = teacherService;
  }

  @GetMapping("/teachers")
    public ResponseEntity<List<Teacher>> getAllStudents() {
      List<Teacher> teachers = teacherService.getAllTeachers();
      return ResponseEntity.ok(teachers);
  }

  @PostMapping("/teacher")
  public ResponseEntity<Teacher> createStudents(@RequestBody Teacher teacher) {
    Teacher createdTeacher = teacherService.createTeacher(teacher);
    return new ResponseEntity<>(createdTeacher, HttpStatus.CREATED);
  }
}