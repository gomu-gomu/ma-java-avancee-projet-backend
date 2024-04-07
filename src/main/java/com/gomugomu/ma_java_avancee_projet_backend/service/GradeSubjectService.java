package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.GradeSubject;
import com.gomugomu.ma_java_avancee_projet_backend.repository.GradeSubjectRepository;



@Service
public class GradeSubjectService {

  private GradeSubjectRepository gradeSubjectRepository;

  @Autowired
  public GradeSubjectService(GradeSubjectRepository userRepository) {
    this.gradeSubjectRepository = userRepository;
  }

  public List<GradeSubject> getAllGradeSubjects() {
    return gradeSubjectRepository.findAll();
  }

  public GradeSubject createGradeSubject(GradeSubject gradeSubject) {
    return gradeSubjectRepository.save(gradeSubject);
  }
}