package com.gomugomu.ma_java_avancee_projet_backend.exam;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, UUID> {
}