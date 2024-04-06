package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "parenthood")
public class Parenthood extends Base {

  @Column(name = "\"parentId\"")
  private UUID parentId;

  @Column(name = "\"studentId\"")
  private UUID studentId;

  public Parenthood() {
    super();
  }

  public Parenthood(UUID id, UUID parentId, UUID studentId, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.parentId = parentId;
    this.studentId = studentId;
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
