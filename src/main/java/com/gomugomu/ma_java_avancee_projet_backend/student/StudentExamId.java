package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.UUID;
import java.io.Serializable;

import lombok.Data;

@Data
class StudentExamId implements Serializable {
  private UUID examId;
  private UUID studentId;
}