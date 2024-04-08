package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Cycle;
import com.gomugomu.ma_java_avancee_projet_backend.service.CycleService;



@RestController
public class CycleController {

  private final CycleService cycleService;

  @Autowired
  public CycleController(CycleService cycleService) {
    this.cycleService = cycleService;
  }

  @GetMapping("/cycles")
    public ResponseEntity<List<Cycle>> getAllClasses() {
      List<Cycle> cycles = cycleService.getAllCycles();
      return ResponseEntity.ok(cycles);
  }

  @PostMapping("/cycle")
  public ResponseEntity<Cycle> createParenthood(@RequestBody Cycle cycle) {
    Cycle createdCycle = cycleService.createCycle(cycle);
    return new ResponseEntity<>(createdCycle, HttpStatus.CREATED);
  }
}