package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.model.BasePrimary;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grades")
@EqualsAndHashCode(callSuper = false)
public class Grade extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private short level;

  @Column(name = "\"sectorId\"", nullable = false)
  private UUID sectorId;
}
