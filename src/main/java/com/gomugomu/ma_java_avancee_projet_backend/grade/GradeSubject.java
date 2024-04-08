package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.common.Base;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(GradeSubjectId.class)
@Table(name = "\"gradeSubjects\"")
@EqualsAndHashCode(callSuper = false)
public class GradeSubject extends Base {

  @Id
  @Column(name = "\"gradeId\"", nullable = false)
  private UUID gradeId;

  @Id
  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;

  @Column(nullable = false)
  private short coefficient;
}