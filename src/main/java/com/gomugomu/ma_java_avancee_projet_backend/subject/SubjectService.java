package com.gomugomu.ma_java_avancee_projet_backend.subject;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SubjectService {

  @Autowired
  private SubjectRepository subjectRepository;

  public List<Subject> getAllSubjects() {
    return subjectRepository.findAll();
  }

  public Subject createSector(Subject subject) {
    return subjectRepository.save(subject);
  }
}