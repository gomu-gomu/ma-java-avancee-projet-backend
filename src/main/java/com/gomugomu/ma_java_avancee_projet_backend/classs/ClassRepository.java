package com.gomugomu.ma_java_avancee_projet_backend.classs;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, UUID> {
}