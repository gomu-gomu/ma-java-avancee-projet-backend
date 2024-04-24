package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DashboardCountResponse {
  private Integer admins;
  private Integer grades;
  private Integer cycles;
  private Integer parents;
  private Integer classes;
  private Integer sectors;
  private Integer teachers;
  private Integer subjects;
  private Integer students;
}
