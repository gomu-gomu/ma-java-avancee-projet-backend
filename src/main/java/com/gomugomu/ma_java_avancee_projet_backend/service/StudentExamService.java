package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.StudentExam;
import com.gomugomu.ma_java_avancee_projet_backend.repository.StudentExamRepository;



@Service
public class StudentExamService {

  private StudentExamRepository studentExamRepository;

  @Autowired
  public StudentExamService(StudentExamRepository studentExamRepository) {
    this.studentExamRepository = studentExamRepository;
  }

  public List<StudentExam> getAllStudentExams() {
    return studentExamRepository.findAll();
  }

  public StudentExam createStudentExam(StudentExam studentExam) {
    return studentExamRepository.save(studentExam);
  }
}