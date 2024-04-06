package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;



@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(generator = "UUID")
  @Column(updatable = false, nullable = false)
  private UUID id;

  @Column(name = "\"userId\"")
  private UUID userId;

  private String cne;
  private String cin;

  
  @Column(name = "\"createdAt\"")
  @CreationTimestamp
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "\"updatedAt\"")
  private Timestamp updatedAt;

  public Student() {}

  public Student(UUID id, UUID userId, String cne, String cin, Timestamp createdAt, Timestamp updatedAt) {
    this.id = id;
    this.userId = userId;
    this.cne = cne;
    this.cin = cin;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public String getCne() {
    return cne;
  }

  public void setCne(String cne) {
    this.cne = cne;
  }

  public String getCin() {
    return cin;
  }

  public void setCin(String cin) {
    this.cin = cin;
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