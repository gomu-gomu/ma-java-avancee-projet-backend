package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.UUID;

import lombok.Data;

import java.io.Serializable;

@Data
class TeacherCycleId implements Serializable {
  private UUID cycleId;
  private UUID teacherId;
}