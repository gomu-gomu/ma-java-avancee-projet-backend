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



class TeacherCycleId implements Serializable {
  private UUID cycleId;
  private UUID teacherId;

  public TeacherCycleId() {}

  public TeacherCycleId(UUID cycleId, UUID teacherId) {
    this.cycleId = cycleId;
    this.teacherId = teacherId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TeacherCycleId that = (TeacherCycleId) o;
    return Objects.equals(cycleId, that.cycleId) && Objects.equals(teacherId, that.teacherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleId, teacherId);
  }

  public UUID getCycleId() {
    return cycleId;
  }

  public void setCycleId(UUID cycleId) {
    this.cycleId = cycleId;
  }

  public UUID getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(UUID teacherId) {
    this.teacherId = teacherId;
  }
}

@Entity
@Table(name = "\"teacherCycles\"")
@IdClass(TeacherCycleId.class)
public class TeacherCycle extends Base {

  @Id
  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;

  @Id
  @Column(name = "\"teacherId\"", nullable = false)
  private UUID teacherId;

  public TeacherCycle() {
    super();
  }

  public TeacherCycle(UUID cycleId, UUID teacherId, Timestamp createdAt, Timestamp updatedAt) {
    super(createdAt, updatedAt);

    this.cycleId = cycleId;
    this.teacherId = teacherId;
  }

  public UUID getCycleId() {
    return cycleId;
  }

  public void setCycleId(UUID cycleId) {
    this.cycleId = cycleId;
  }

  public UUID getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(UUID teacherId) {
    this.teacherId = teacherId;
  }
}
