package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Sector;
import com.gomugomu.ma_java_avancee_projet_backend.service.SectorService;



@RestController
public class SectorController {

  private final SectorService sectorService;

  @Autowired
  public SectorController(SectorService sectorService) {
    this.sectorService = sectorService;
  }

  @GetMapping("/sectors")
    public ResponseEntity<List<Sector>> getAllSectors() {
      List<Sector> sectors = sectorService.getAllSectors();
      return ResponseEntity.ok(sectors);
  }

  @PostMapping("/sector")
  public ResponseEntity<Sector> createParenthood(@RequestBody Sector sector) {
    Sector createdSector = sectorService.createSector(sector);
    return new ResponseEntity<>(createdSector, HttpStatus.CREATED);
  }
}