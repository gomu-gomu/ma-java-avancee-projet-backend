package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Exam;
import com.gomugomu.ma_java_avancee_projet_backend.repository.ExamRepository;



@Service
public class ExamService {

  private ExamRepository examRepository;

  @Autowired
  public ExamService(ExamRepository examRepository) {
    this.examRepository = examRepository;
  }

  public List<Exam> getalleExams() {
    return examRepository.findAll();
  }

  public Exam createExam(Exam exam) {
    return examRepository.save(exam);
  }
}