package com.gomugomu.ma_java_avancee_projet_backend.classs;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClassService {

  @Autowired
  private ClassRepository classRepository;

  public List<Class> getAllClasses() {
    return classRepository.findAll();
  }

  public Class createClass(Class classObj) {
    return classRepository.save(classObj);
  }
}