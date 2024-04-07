package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "classes")
public class Class extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(name = "\"gradeId\"", nullable = false)
  private UUID gradeId;

  public Class() {
    super();
  }

  public Class(UUID id, UUID gradeId, String name, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.name = name;
    this.gradeId = gradeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UUID getGradeId() {
    return gradeId;
  }

  public void setGradeId(UUID gradeId) {
    this.gradeId = gradeId;
  }
}
