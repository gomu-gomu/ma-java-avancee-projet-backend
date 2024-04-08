package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.util.Objects;
import java.sql.Timestamp;
import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;



class StudentExamId implements Serializable {
  private UUID examId;
  private UUID studentId;

  public StudentExamId() {}

  public StudentExamId(UUID examId, UUID studentId) {
    this.examId = examId;
    this.studentId = studentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    StudentExamId that = (StudentExamId) o;
    return Objects.equals(examId, that.examId) && Objects.equals(studentId, that.studentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examId, studentId);
  }

  public UUID getExamId() {
    return examId;
  }

  public void setExamId(UUID examId) {
    this.examId = examId;
  }

  public UUID getStudentId() {
    return studentId;
  }

  public void setStudentId(UUID studentId) {
    this.studentId = studentId;
  }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "\"studentExams\"")
@IdClass(StudentExamId.class)
public class StudentExam extends Base {

  @Id
  @Column(name = "\"examId\"", nullable = false)
  private UUID examId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;

  @Column(nullable = true)
  private short score;
}
