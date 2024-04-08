package com.gomugomu.ma_java_avancee_projet_backend.teacher;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.model.Base;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(TeacherCycleId.class)
@Table(name = "\"teacherCycles\"")
@EqualsAndHashCode(callSuper = false)
public class TeacherCycle extends Base {

  @Id
  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;

  @Id
  @Column(name = "\"teacherId\"", nullable = false)
  private UUID teacherId;
}
