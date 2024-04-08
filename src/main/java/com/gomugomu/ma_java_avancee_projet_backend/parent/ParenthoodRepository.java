package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParenthoodRepository extends JpaRepository<Parenthood, UUID> {
}