package com.gomugomu.ma_java_avancee_projet_backend.sector;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, UUID> {
}