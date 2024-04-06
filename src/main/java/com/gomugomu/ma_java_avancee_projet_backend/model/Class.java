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

  @Column(nullable = false)
  private short level;

  public Class() {
    super();
  }

  public Class(UUID id, String name, short level, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.name = name;
    this.level = level;
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
