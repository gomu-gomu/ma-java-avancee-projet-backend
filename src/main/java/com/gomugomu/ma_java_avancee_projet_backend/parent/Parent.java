package com.gomugomu.ma_java_avancee_projet_backend.parent;

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
@Table(name = "parents")
@EqualsAndHashCode(callSuper = false)
public class Parent extends BasePrimary {

  @Column(name = "\"userId\"", nullable = false)
  private UUID userId;

  @Column(nullable = false, unique = true)
  private String cin;

  @Column(nullable = false)
  private String phone;

  @Column(name = "\"firstName\"", nullable = false)
  private String firstName;

  @Column(name = "\"lastName\"", nullable = false)
  private String lastName;
}