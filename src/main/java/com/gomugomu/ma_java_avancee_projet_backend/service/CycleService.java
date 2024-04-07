package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Cycle;
import com.gomugomu.ma_java_avancee_projet_backend.repository.CycleRepository;



@Service
public class CycleService {

  private CycleRepository cycleRepository;

  @Autowired
  public CycleService(CycleRepository userRepository) {
    this.cycleRepository = userRepository;
  }

  public List<Cycle> getAllCycles() {
    return cycleRepository.findAll();
  }

  public Cycle createCycle(Cycle cycle) {
    return cycleRepository.save(cycle);
  }
}