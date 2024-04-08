package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherCycleRepository extends JpaRepository<TeacherCycle, UUID> {
}