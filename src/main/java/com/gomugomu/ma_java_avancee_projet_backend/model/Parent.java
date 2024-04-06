package com.gomugomu.ma_java_avancee_projet_backend.model;

import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
@Table(name = "parents")
public class Parent extends Base {

  @Column(name = "\"userId\"", nullable = false)
  private UUID userId;

  @Column(nullable = false)
  private String cin;

  @Column(nullable = false)
  private String phone;

  @Column(name = "\"firstName\"", nullable = false)
  private String firstName;

  @Column(name = "\"lastName\"", nullable = false)
  private String lastName;

  public Parent() {
    super();
  }
  
  public Parent(UUID id, UUID userId, String cin, String firstName, String lastName, String phone, Timestamp createdAt, Timestamp updatedAt) {
    super(id, createdAt, updatedAt);

    this.cin = cin;
    this.phone = phone;
    this.userId = userId;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public String getCin() {
    return cin;
  }

  public void setCin(String cin) {
    this.cin = cin;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}