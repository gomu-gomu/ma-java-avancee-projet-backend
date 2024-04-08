package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cycle")
public class CycleController {

  @Autowired
  private CycleService cycleService;

  @GetMapping("")
  public ResponseEntity<List<Cycle>> getAllClasses() {
    List<Cycle> cycles = cycleService.getAllCycles();
    return ResponseEntity.ok(cycles);
  }

  @PostMapping("")
  public ResponseEntity<Cycle> createParenthood(@RequestBody Cycle cycle) {
    Cycle createdCycle = cycleService.createCycle(cycle);
    return new ResponseEntity<>(createdCycle, HttpStatus.CREATED);
  }
}