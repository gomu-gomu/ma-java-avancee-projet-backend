package com.gomugomu.ma_java_avancee_projet_backend.exam;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.model.BasePrimary;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exams")
@EqualsAndHashCode(callSuper = false)
public class Exam extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;

  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;
}
