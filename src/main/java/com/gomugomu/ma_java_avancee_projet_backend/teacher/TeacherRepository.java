package com.gomugomu.ma_java_avancee_projet_backend.teacher;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}