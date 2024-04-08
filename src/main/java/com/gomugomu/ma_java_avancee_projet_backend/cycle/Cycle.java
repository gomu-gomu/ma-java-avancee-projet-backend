package com.gomugomu.ma_java_avancee_projet_backend.cycle;

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
@Table(name = "cycles")
@EqualsAndHashCode(callSuper = false)
public class Cycle extends BasePrimary {

  @Column(nullable = false)
  private short year;

  @Column(name = "\"classId\"", nullable = false)
  private UUID classId;
}
