package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.StudentCycle;
import com.gomugomu.ma_java_avancee_projet_backend.repository.StudentCycleRepository;



@Service
public class StudentCycleService {

  private StudentCycleRepository studentCycleRepository;

  @Autowired
  public StudentCycleService(StudentCycleRepository studentCycleRepository) {
    this.studentCycleRepository = studentCycleRepository;
  }

  public List<StudentCycle> getAllStudentCycles() {
    return studentCycleRepository.findAll();
  }

  public StudentCycle createStudentCycle(StudentCycle studentCycle) {
    return studentCycleRepository.save(studentCycle);
  }
}