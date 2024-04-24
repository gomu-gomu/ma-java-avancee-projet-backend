package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class CycleSuccessResponse {
  private short year;
  private Double successRate;
}
