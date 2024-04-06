package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;



@MappedSuperclass
public abstract class Base {
  
  @Column(name = "\"createdAt\"", nullable = false)
  @CreationTimestamp
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "\"updatedAt\"", nullable = false)
  private Timestamp updatedAt;

  public Base() {}
  
  public Base(Timestamp createdAt, Timestamp updatedAt) {
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
