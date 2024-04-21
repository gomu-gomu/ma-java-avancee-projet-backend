package com.gomugomu.ma_java_avancee_projet_backend.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @PostMapping("/login")
  ResponseEntity<String> login(@RequestBody LoginDTO login) {
    return ResponseEntity.ok(String.format("login for %s", login.getEmail()));
  }
}
