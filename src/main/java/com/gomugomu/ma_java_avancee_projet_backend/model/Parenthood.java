package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.util.Objects;
import java.sql.Timestamp;
import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;



class ParenthoodId implements Serializable {
  private UUID parentId;
  private UUID studentId;

  public ParenthoodId() {}

  public ParenthoodId(UUID parentId, UUID studentId) {
    this.parentId = parentId;
    this.studentId = studentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ParenthoodId that = (ParenthoodId) o;
    return Objects.equals(parentId, that.parentId) && Objects.equals(studentId, that.studentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, studentId);
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

@Entity
@Table(name = "parenthoods")
@IdClass(ParenthoodId.class)
public class Parenthood extends Base {

  @Id
  @Column(name = "\"parentId\"", nullable = false)
  private UUID parentId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;

  public Parenthood() {
    super();
  }

  public Parenthood(UUID parentId, UUID studentId, Timestamp createdAt, Timestamp updatedAt) {
    super(createdAt, updatedAt);

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
