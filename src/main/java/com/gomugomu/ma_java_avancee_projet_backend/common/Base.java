package com.gomugomu.ma_java_avancee_projet_backend.common;

import java.sql.Timestamp;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class Base {

  @Column(name = "\"createdAt\"", nullable = false)
  @CreationTimestamp
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "\"updatedAt\"", nullable = false)
  private Timestamp updatedAt;
}