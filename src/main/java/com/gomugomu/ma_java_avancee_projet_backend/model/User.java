package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import com.gomugomu.ma_java_avancee_projet_backend.enums.UserType;



@Entity
@Table(name = "users")
public class User extends BasePrimary {

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String password;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "type", nullable = false)
  private UserType type;

  public User() {
    super();
  }
  
  public User(UUID id, String email, String password, UserType type, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.type = type;
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserType getType() {
    return type;
  }

  public void setType(UserType type) {
    this.type = type;
  }
}