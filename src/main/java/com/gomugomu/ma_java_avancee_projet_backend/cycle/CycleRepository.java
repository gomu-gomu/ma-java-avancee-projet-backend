package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CycleRepository extends JpaRepository<Cycle, UUID> {

  @Query("SELECT COUNT(DISTINCT cycle.year) FROM Cycle cycle")
  Integer countYears();
}