package com.gomugomu.ma_java_avancee_projet_backend.sector;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Table;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sectors")
@EqualsAndHashCode(callSuper = false)
public class Sector extends BasePrimary {

  @Column(nullable = false)
  private String name;
}
