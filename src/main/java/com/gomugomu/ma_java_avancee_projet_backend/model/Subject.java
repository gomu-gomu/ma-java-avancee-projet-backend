package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "subjects")
public class Subject extends BasePrimary {

  @Column(nullable = false)
  private String name;

  public Subject() {
    super();
  }

  public Subject(UUID id, String name, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
