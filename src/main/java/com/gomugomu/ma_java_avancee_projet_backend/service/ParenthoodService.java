package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Parenthood;
import com.gomugomu.ma_java_avancee_projet_backend.repository.ParenthoodRepository;



@Service
public class ParenthoodService {

  private ParenthoodRepository parenthoodRepository;

  @Autowired
  public ParenthoodService(ParenthoodRepository userRepository) {
    this.parenthoodRepository = userRepository;
  }

  public List<Parenthood> getAllParenthoods() {
    return parenthoodRepository.findAll();
  }

  public Parenthood createParenthood(Parenthood parenthood) {
    return parenthoodRepository.save(parenthood);
  }
}