package com.gomugomu.ma_java_avancee_projet_backend.service;

import org.springframework.stereotype.Service;

import com.gomugomu.ma_java_avancee_projet_backend.model.User;
import com.gomugomu.ma_java_avancee_projet_backend.model.LoginRequest;
import com.gomugomu.ma_java_avancee_projet_backend.model.LoginResponse;
import com.gomugomu.ma_java_avancee_projet_backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;



@Service
public class AuthService {

  private final JwtService jwtService;
  private final UserRepository userRepository;
  private final AuthenticationManager authenticationManager;

  @Autowired
  public AuthService(UserRepository userRepository, JwtService jwtService, AuthenticationManager authenticationManager) { 
    this.jwtService = jwtService;
    this.userRepository = userRepository;
    this.authenticationManager = authenticationManager;
  }

  public LoginResponse login(LoginRequest request) {
    this.authenticationManager.authenticate(
      new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
    );

    User user = this.userRepository.findByEmail(request.getEmail()).orElseThrow();
    var jwt = this.jwtService.generateToken(user);

    return new LoginResponse(jwt);
  }
}