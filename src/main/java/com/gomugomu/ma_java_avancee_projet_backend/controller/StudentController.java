package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Student;
import com.gomugomu.ma_java_avancee_projet_backend.service.StudentService;



@RestController
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
      List<Student> students = studentService.getAllStudents();
      return ResponseEntity.ok(students);
  }

  @PostMapping("/student")
  public ResponseEntity<Student> createStudents(@RequestBody Student student) {
    Student createdStudent = studentService.createStudent(student);
    return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
  }
}