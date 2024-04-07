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



class StudentCycleId implements Serializable {
  private UUID cycleId;
  private UUID studentId;

  public StudentCycleId() {}

  public StudentCycleId(UUID cycleId, UUID studentId) {
    this.cycleId = cycleId;
    this.studentId = studentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    StudentCycleId that = (StudentCycleId) o;
    return Objects.equals(cycleId, that.cycleId) && Objects.equals(studentId, that.studentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleId, studentId);
  }

  public UUID getCycleId() {
    return cycleId;
  }

  public void setCycleId(UUID cycleId) {
    this.cycleId = cycleId;
  }

  public UUID getStudentId() {
    return studentId;
  }

  public void setStudentId(UUID studentId) {
    this.studentId = studentId;
  }
}

@Entity
@Table(name = "\"studentCycles\"")
@IdClass(StudentCycleId.class)
public class StudentCycle extends Base {

  @Id
  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;

  public StudentCycle() {
    super();
  }

  public StudentCycle(UUID cycleId, UUID studentId, Timestamp createdAt, Timestamp updatedAt) {
    super(createdAt, updatedAt);

    this.cycleId = cycleId;
    this.studentId = studentId;
  }

  public UUID getCycleId() {
    return cycleId;
  }

  public void setCycleId(UUID cycleId) {
    this.cycleId = cycleId;
  }

  public UUID getStudentId() {
    return studentId;
  }

  public void setStudentId(UUID studentId) {
    this.studentId = studentId;
  }
}
