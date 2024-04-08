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
@RequestMapping("/teacher")
public class TeacherController {

  @Autowired
  private TeacherService teacherService;

  @GetMapping("")
  public ResponseEntity<List<Teacher>> getAllStudents() {
    List<Teacher> teachers = teacherService.getAllTeachers();
    return ResponseEntity.ok(teachers);
  }

  @PostMapping("")
  public ResponseEntity<Teacher> createStudents(@RequestBody Teacher teacher) {
    Teacher createdTeacher = teacherService.createTeacher(teacher);
    return new ResponseEntity<>(createdTeacher, HttpStatus.CREATED);
  }
}