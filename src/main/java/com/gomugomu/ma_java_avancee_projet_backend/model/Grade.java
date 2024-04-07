package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "grades")
public class Grade extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private short level;

  @Column(name = "\"sectorId\"", nullable = false)
  private UUID sectorId;

  public Grade() {
    super();
  }

  public Grade(UUID id, UUID sectorId, String name, short level, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.name = name;
    this.level = level;
    this.sectorId = sectorId;
  }

  public UUID getSectorId() {
    return sectorId;
  }

  public void setSectorId(UUID sectorId) {
    this.sectorId = sectorId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public short getLevel() {
    return level;
  }

  public void setLevel(short level) {
    this.level = level;
  }
}
