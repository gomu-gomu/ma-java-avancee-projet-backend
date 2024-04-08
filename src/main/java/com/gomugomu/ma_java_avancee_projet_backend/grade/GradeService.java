package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GradeService {

  @Autowired
  private GradeRepository gradeRepository;

  public List<Grade> getAllGrades() {
    return gradeRepository.findAll();
  }

  public Grade createClass(Grade grade) {
    return gradeRepository.save(grade);
  }
}