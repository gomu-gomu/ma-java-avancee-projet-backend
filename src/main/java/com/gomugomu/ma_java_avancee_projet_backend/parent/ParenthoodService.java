package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ParenthoodService {

  @Autowired
  private ParenthoodRepository parenthoodRepository;

  public List<Parenthood> getAllParenthoods() {
    return parenthoodRepository.findAll();
  }

  public Parenthood createParenthood(Parenthood parenthood) {
    return parenthoodRepository.save(parenthood);
  }
}