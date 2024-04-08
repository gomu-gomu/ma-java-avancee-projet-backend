package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.UUID;

import lombok.Data;

import java.io.Serializable;

@Data
class GradeSubjectId implements Serializable {
  private UUID gradeId;
  private UUID subjectId;
}