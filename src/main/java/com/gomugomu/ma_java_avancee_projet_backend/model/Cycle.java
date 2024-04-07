package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "cycles")
public class Cycle extends BasePrimary {

  @Column(nullable = false)
  private short year;

  @Column(name = "\"classId\"", nullable = false)
  private UUID classId;

  public Cycle() {
    super();
  }

  public Cycle(UUID id, UUID classId, short year, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.year = year;
    this.classId = classId;
  }

  public UUID getClassId() {
    return classId;
  }

  public void setClassId(UUID classId) {
    this.classId = classId;
  }

  public short getYear() {
    return year;
  }

  public void setYear(short year) {
    this.year = year;
  }
}
