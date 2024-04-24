package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

  @Autowired
  private DashboardService dashboardService;

  @GetMapping("/count")
  ResponseEntity<DashboardCountResponse> login() {
    DashboardCountResponse response = dashboardService.getCounts();
    return ResponseEntity.ok(response);
  }

  @GetMapping("/cycleSuccess")
  ResponseEntity<List<CycleSuccessResponse>> cycleSuccess() {
    var response = dashboardService.getCycleSuccess();
    return ResponseEntity.ok(response);
  }
}
