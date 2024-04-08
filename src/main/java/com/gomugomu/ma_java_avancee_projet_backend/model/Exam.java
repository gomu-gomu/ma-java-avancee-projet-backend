package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "exams")
public class Exam extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;
  
  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;

  public Exam() {
    super();
  }

  public Exam(UUID id, UUID cycleId, UUID subjectId, String name, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.name = name;
    this.cycleId = cycleId;
    this.subjectId = subjectId;
  }

  public UUID getCycleId() {
    return cycleId;
  }

  public void setCycleId(UUID cycleId) {
    this.cycleId = cycleId;
  }

  public UUID getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(UUID subjectId) {
    this.subjectId = subjectId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
