package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentExamService {

  @Autowired
  private StudentExamRepository studentExamRepository;

  public List<StudentExam> getAllStudentExams() {
    return studentExamRepository.findAll();
  }

  public StudentExam createStudentExam(StudentExam studentExam) {
    return studentExamRepository.save(studentExam);
  }
}