package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCycleRepository extends JpaRepository<StudentCycle, UUID> {
}