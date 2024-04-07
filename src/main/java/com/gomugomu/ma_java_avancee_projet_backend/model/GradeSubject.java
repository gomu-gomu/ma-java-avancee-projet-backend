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



class GradeSubjectId implements Serializable {
  private UUID gradeId;
  private UUID subjectId;

  public GradeSubjectId() {}

  public GradeSubjectId(UUID gradeId, UUID subjectId) {
    this.gradeId = gradeId;
    this.subjectId = subjectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GradeSubjectId that = (GradeSubjectId) o;
    return Objects.equals(gradeId, that.gradeId) && Objects.equals(subjectId, that.subjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gradeId, subjectId);
  }

  public UUID getGradeId() {
    return gradeId;
  }

  public void setGradeId(UUID gradeId) {
    this.gradeId = gradeId;
  }

  public UUID getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(UUID subjectId) {
    this.subjectId = subjectId;
  }
}

@Entity
@Table(name = "\"gradeSubjects\"")
@IdClass(GradeSubjectId.class)
public class GradeSubject extends Base {

  @Id
  @Column(name = "\"gradeId\"", nullable = false)
  private UUID gradeId;

  @Id
  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;
  
  @Column(nullable = false)
  private short coefficient;

  public GradeSubject() {
    super();
  }

  public GradeSubject(UUID gradeId, UUID subjectId, short coefficient, Timestamp createdAt, Timestamp updatedAt) {
    super(createdAt, updatedAt);

    this.gradeId = gradeId;
    this.subjectId = subjectId;
    this.coefficient = coefficient;
  }

 public UUID getGradeId() {
   return gradeId;
 }

 public void setGradeId(UUID gradeId) {
   this.gradeId = gradeId;
 }

 public UUID getSubjectId() {
   return subjectId;
 }

 public void setSubjectId(UUID subjectId) {
   this.subjectId = subjectId;
 }

 public short getCoefficient() {
   return coefficient;
 }

 public void setCoefficient(short coefficient) {
   this.coefficient = coefficient;
 }
}
