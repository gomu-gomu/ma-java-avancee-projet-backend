package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
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
    List<CycleSuccessResponse> response = dashboardService.getCycleSuccess();
    return ResponseEntity.ok(response);
  }

  @GetMapping("/topStudents")
  ResponseEntity<List<TopStudentsResponse>> topStudents(@RequestParam(defaultValue = "3") Short max) {
    List<TopStudentsResponse> response = dashboardService.getTopStudents(max);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/latestCycleYear")
  ResponseEntity<Short> latestCycleYear() {
    Short response = dashboardService.getLatestCycleYear();
    return ResponseEntity.ok(response);
  }

  @GetMapping("/topClasses")
  ResponseEntity<List<TopClassesResponse>> topClasses(@RequestParam(defaultValue = "3") Short max) {
    List<TopClassesResponse> response = dashboardService.getTopClasses(max);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/info/student/{id}")
  ResponseEntity<List<StudentInfoResponse>> topClasses(@PathVariable UUID id) {
    List<StudentInfoResponse> response = dashboardService.getStudentInfo(id);
    return ResponseEntity.ok(response);
  }
}