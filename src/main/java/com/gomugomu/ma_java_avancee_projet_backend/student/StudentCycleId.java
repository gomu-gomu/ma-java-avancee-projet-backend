package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.UUID;

import lombok.Data;

import java.io.Serializable;

@Data
class StudentCycleId implements Serializable {
  private UUID cycleId;
  private UUID studentId;
}
