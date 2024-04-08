package com.gomugomu.ma_java_avancee_projet_backend.exam;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ExamService {

  @Autowired
  private ExamRepository examRepository;

  public List<Exam> getalleExams() {
    return examRepository.findAll();
  }

  public Exam createExam(Exam exam) {
    return examRepository.save(exam);
  }
}