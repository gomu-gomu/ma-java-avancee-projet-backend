package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ParentService {

  @Autowired
  private ParentRepository parentRepository;

  public List<Parent> getAllParents() {
    return parentRepository.findAll();
  }

  public Parent createParent(Parent parent) {
    return parentRepository.save(parent);
  }
}