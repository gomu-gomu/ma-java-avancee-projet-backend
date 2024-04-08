package com.gomugomu.ma_java_avancee_projet_backend.sector;

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
@RequestMapping("/sector")
public class SectorController {

  @Autowired
  private SectorService sectorService;

  @GetMapping("")
  public ResponseEntity<List<Sector>> getAllSectors() {
    List<Sector> sectors = sectorService.getAllSectors();
    return ResponseEntity.ok(sectors);
  }

  @PostMapping("")
  public ResponseEntity<Sector> createParenthood(@RequestBody Sector sector) {
    Sector createdSector = sectorService.createSector(sector);
    return new ResponseEntity<>(createdSector, HttpStatus.CREATED);
  }
}