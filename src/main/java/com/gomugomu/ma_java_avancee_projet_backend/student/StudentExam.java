package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.common.Base;

import lombok.Data;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(StudentExamId.class)
@Table(name = "\"studentExams\"")
@EqualsAndHashCode(callSuper = false)
public class StudentExam extends Base {

  @Id
  @Column(name = "\"examId\"", nullable = false)
  private UUID examId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;

  @Column(nullable = true)
  private Float score;
}