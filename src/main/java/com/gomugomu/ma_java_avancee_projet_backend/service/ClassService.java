package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Class;
import com.gomugomu.ma_java_avancee_projet_backend.repository.ClassRepository;



@Service
public class ClassService {

  private ClassRepository classRepository;

  @Autowired
  public ClassService(ClassRepository userRepository) {
    this.classRepository = userRepository;
  }

  public List<Class> getAllClasses() {
    return classRepository.findAll();
  }

  public Class createClass(Class classObj) {
    return classRepository.save(classObj);
  }
}