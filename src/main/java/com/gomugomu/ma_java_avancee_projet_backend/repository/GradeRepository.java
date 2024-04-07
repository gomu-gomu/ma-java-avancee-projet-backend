package com.gomugomu.ma_java_avancee_projet_backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gomugomu.ma_java_avancee_projet_backend.model.Grade;



public interface GradeRepository extends JpaRepository<Grade, UUID> {}