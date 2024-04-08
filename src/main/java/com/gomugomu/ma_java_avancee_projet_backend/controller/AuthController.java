package com.gomugomu.ma_java_avancee_projet_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gomugomu.ma_java_avancee_projet_backend.model.LoginRequest;
import com.gomugomu.ma_java_avancee_projet_backend.model.LoginResponse;



@RestController
public class AuthController {

  @PostMapping("/login")
  public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

  }
}
