package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GradeSubjectService {

  @Autowired
  private GradeSubjectRepository gradeSubjectRepository;

  public List<GradeSubject> getAllGradeSubjects() {
    return gradeSubjectRepository.findAll();
  }

  public GradeSubject createGradeSubject(GradeSubject gradeSubject) {
    return gradeSubjectRepository.save(gradeSubject);
  }
}