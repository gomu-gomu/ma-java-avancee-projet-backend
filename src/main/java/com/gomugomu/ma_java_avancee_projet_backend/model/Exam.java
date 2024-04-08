package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "exams")
public class Exam extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(name = "\"cycleId\"", nullable = false)
  private UUID cycleId;
  
  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;
}
