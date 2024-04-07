package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Sector;
import com.gomugomu.ma_java_avancee_projet_backend.repository.SectorRepository;



@Service
public class SectorService {

  private SectorRepository sectorRepository;

  @Autowired
  public SectorService(SectorRepository sectorRepository) {
    this.sectorRepository = sectorRepository;
  }

  public List<Sector> getAllSectors() {
    return sectorRepository.findAll();
  }

  public Sector createSector(Sector sector) {
    return sectorRepository.save(sector);
  }
}