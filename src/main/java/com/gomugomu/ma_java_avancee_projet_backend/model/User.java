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
public class User extends Base {

  private String email;
  private String password;

  @Column(name = "\"firstName\"")
  private String firstName;

  @Column(name = "\"lastName\"")
  private String lastName;

  private String phone;

  @Column(name = "type")
  @Enumerated(EnumType.ORDINAL)
  private UserType type;

  public User() {
    super();
  }
  
  public User(UUID id, String email, String password, String firstName, String lastName, String phone, UserType type, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.type = type;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserType getType() {
    return type;
  }

  public void setType(UserType type) {
    this.type = type;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}