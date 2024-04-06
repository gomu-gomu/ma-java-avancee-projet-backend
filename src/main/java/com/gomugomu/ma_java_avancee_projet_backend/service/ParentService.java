package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Parent;
import com.gomugomu.ma_java_avancee_projet_backend.repository.ParentRepository;



@Service
public class ParentService {

  private ParentRepository parentRepository;

  @Autowired
  public ParentService(ParentRepository userRepository) {
    this.parentRepository = userRepository;
  }

  public List<Parent> getAllParents() {
    return parentRepository.findAll();
  }

  public Parent createParent(Parent parent) {
    return parentRepository.save(parent);
  }
}