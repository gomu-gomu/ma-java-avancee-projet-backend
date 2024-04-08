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
@Table(name = "teachers")
public class Teacher extends BasePrimary {

  @Column(name = "\"userId\"", nullable = false)
  private UUID userId;

  @Column(name = "\"subjectId\"", nullable = false)
  private UUID subjectId;

  @Column(nullable = false, unique = true)
  private String cin;

  @Column(nullable = false)
  private String phone;

  @Column(name = "\"firstName\"", nullable = false)
  private String firstName;

  @Column(name = "\"lastName\"", nullable = false)
  private String lastName;
}