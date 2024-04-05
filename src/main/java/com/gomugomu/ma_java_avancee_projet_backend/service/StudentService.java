package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Student;
import com.gomugomu.ma_java_avancee_projet_backend.repository.StudentRepository;



@Service
public class StudentService {

  private StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository userRepository) {
    this.studentRepository = userRepository;
  }

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }
}