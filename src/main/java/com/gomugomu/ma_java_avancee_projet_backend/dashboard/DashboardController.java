package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

  @GetMapping("/count")
  ResponseEntity<DashboardCountResponse> login() {
    DashboardCountResponse response = DashboardCountResponse
    .builder()
    .build();

    return ResponseEntity.ok(response);
  }
}
