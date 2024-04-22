package com.gomugomu.ma_java_avancee_projet_backend.auth;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomugomu.ma_java_avancee_projet_backend.user.User;
import com.gomugomu.ma_java_avancee_projet_backend.user.UserRepository;
import com.gomugomu.ma_java_avancee_projet_backend.security.JwtService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private JwtService jwtService;

  @PostMapping("/login")
  ResponseEntity<LoginResponse> login(@RequestBody LoginRequest login) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            login.getEmail(),
            login.getPassword()));

    User user = userRepository.findByEmail(login.getEmail()).orElseThrow();
    String jwtToken = jwtService.generateToken(user);
    String refreshToken = jwtService.generateRefreshToken(user);

    LoginResponse token = LoginResponse.builder()
        .accessToken(jwtToken)
        .refreshToken(refreshToken)
        .build();

    return ResponseEntity.ok(token);
  }
}
