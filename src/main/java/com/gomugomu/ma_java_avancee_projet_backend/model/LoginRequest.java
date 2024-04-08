package com.gomugomu.ma_java_avancee_projet_backend.model;



public class LoginRequest {

  private String email;
  private String password;

  public LoginRequest() {}
  
  public LoginRequest(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String token) {
    this.email = token;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}