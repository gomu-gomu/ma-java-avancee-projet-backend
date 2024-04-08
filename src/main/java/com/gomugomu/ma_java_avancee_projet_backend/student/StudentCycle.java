package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.common.Base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(StudentCycleId.class)
@Table(name = "\"studentCycles\"")
@EqualsAndHashCode(callSuper = false)
public class StudentCycle extends Base {

  @Id
  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;
}
