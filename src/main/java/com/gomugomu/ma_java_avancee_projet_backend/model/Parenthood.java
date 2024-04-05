package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;



@Entity
@Table(name = "parenthood")
public class Parenthood {

  @Id
  @GeneratedValue(generator = "UUID")
  @Column(updatable = false, nullable = false)
  private UUID id;

  @Column(name = "\"parentId\"")
  private UUID parentId;

  @Column(name = "\"studentId\"")
  private UUID studentId;

  public Parenthood() {}

  public Parenthood(UUID id, UUID parentId, UUID studentId) {
    this.id = id;
    this.parentId = parentId;
    this.studentId = studentId;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public UUID getStudentId() {
    return studentId;
  }

  public void setStudentId(UUID studentId) {
    this.studentId = studentId;
  }
}
