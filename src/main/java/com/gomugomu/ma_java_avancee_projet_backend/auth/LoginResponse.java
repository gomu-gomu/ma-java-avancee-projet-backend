package com.gomugomu.ma_java_avancee_projet_backend.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

  @JsonProperty("accessToken")
  private String accessToken;

  @JsonProperty("refreshToken")
  private String refreshToken;
}