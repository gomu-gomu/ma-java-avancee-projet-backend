package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CycleService {

  @Autowired
  private CycleRepository cycleRepository;

  public List<Cycle> getAllCycles() {
    return cycleRepository.findAll();
  }

  public Cycle createCycle(Cycle cycle) {
    return cycleRepository.save(cycle);
  }
}