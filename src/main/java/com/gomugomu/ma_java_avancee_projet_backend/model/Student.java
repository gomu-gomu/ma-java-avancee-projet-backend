package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;



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

  public Student() {}

  public Student(UUID id, UUID userId, String cne, String cin) {
    this.id = id;
    this.userId = userId;
    this.cne = cne;
    this.cin = cin;
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
}