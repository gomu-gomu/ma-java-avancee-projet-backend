package com.gomugomu.ma_java_avancee_projet_backend.auth;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {

  @JsonProperty(value = "email")
  private String email;

  @JsonProperty(value = "password")
  private String password;
}
