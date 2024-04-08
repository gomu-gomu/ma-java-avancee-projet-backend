package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeSubjectRepository extends JpaRepository<GradeSubject, UUID> {
}