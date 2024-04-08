package com.gomugomu.ma_java_avancee_projet_backend.sector;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SectorService {

  @Autowired
  private SectorRepository sectorRepository;

  public List<Sector> getAllSectors() {
    return sectorRepository.findAll();
  }

  public Sector createSector(Sector sector) {
    return sectorRepository.save(sector);
  }
}