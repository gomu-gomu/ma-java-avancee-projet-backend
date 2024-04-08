package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentCycleService {

  @Autowired
  private StudentCycleRepository studentCycleRepository;

  public List<StudentCycle> getAllStudentCycles() {
    return studentCycleRepository.findAll();
  }

  public StudentCycle createStudentCycle(StudentCycle studentCycle) {
    return studentCycleRepository.save(studentCycle);
  }
}