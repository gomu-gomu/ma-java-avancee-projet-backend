package com.gomugomu.ma_java_avancee_projet_backend.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(callSuper = false)
public class User extends BasePrimary {

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String password;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "type", nullable = false)
  private UserType type;
}