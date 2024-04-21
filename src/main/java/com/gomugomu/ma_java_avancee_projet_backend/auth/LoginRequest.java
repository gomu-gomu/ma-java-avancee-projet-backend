package com.gomugomu.ma_java_avancee_projet_backend.auth;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

  @JsonProperty(value = "email")
  private String email;

  @JsonProperty(value = "password")
  private String password;
}
