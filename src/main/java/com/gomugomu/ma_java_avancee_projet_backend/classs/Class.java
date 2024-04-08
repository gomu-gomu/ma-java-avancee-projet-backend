package com.gomugomu.ma_java_avancee_projet_backend.classs;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

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
@Table(name = "classes")
@EqualsAndHashCode(callSuper = false)
public class Class extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(name = "\"gradeId\"", nullable = false)
  private UUID gradeId;
}
