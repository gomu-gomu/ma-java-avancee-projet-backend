package com.gomugomu.ma_java_avancee_projet_backend.subject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
@EqualsAndHashCode(callSuper = false)
public class Subject extends BasePrimary {

  @Column(nullable = false)
  private String name;
}
