package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Subject;
import com.gomugomu.ma_java_avancee_projet_backend.repository.SubjectRepository;



@Service
public class SubjectService {

  private SubjectRepository subjectRepository;

  @Autowired
  public SubjectService(SubjectRepository subjectRepository) {
    this.subjectRepository = subjectRepository;
  }

  public List<Subject> getAllSubjects() {
    return subjectRepository.findAll();
  }

  public Subject createSector(Subject subject) {
    return subjectRepository.save(subject);
  }
}