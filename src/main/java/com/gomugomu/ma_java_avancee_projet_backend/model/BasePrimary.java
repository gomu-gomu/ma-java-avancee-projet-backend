package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;



@MappedSuperclass
public abstract class BasePrimary extends Base {

  @Id
  @GeneratedValue(generator = "UUID")
  @Column(updatable = false, nullable = false)
  private UUID id;

  public BasePrimary() {}
  
  public BasePrimary(UUID id, Timestamp createdAt, Timestamp updatedAt) {
    super(createdAt, updatedAt);
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }
}
