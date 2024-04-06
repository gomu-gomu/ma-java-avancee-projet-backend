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

  @Column(name = "\"createdAt\"")
  @CreationTimestamp
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "\"updatedAt\"")
  private Timestamp updatedAt;

  public Parenthood() {}

  public Parenthood(UUID id, UUID parentId, UUID studentId, Timestamp createdAt, Timestamp updatedAt) {
    this.id = id;
    this.parentId = parentId;
    this.studentId = studentId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
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
