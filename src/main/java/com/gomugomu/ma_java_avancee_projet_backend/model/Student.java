package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "students")
public class Student extends Base {

  @Column(name = "\"userId\"")
  private UUID userId;

  private String cne;
  private String cin;

  public Student() {
    super();
  }
  
  public Student(UUID id, UUID userId, String cne, String cin, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.userId = userId;
    this.cne = cne;
    this.cin = cin;
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