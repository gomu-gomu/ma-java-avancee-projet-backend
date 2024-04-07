package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Grade;
import com.gomugomu.ma_java_avancee_projet_backend.repository.GradeRepository;



@Service
public class GradeService {

  private GradeRepository gradeRepository;

  @Autowired
  public GradeService(GradeRepository gradeRepository) {
    this.gradeRepository = gradeRepository;
  }

  public List<Grade> getAllGrades() {
    return gradeRepository.findAll();
  }

  public Grade createClass(Grade grade) {
    return gradeRepository.save(grade);
  }
}