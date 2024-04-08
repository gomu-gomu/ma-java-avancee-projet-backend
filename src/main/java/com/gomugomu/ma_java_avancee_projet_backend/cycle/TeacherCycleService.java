package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TeacherCycleService {

  @Autowired
  private TeacherCycleRepository teacherCycleRepository;

  public List<TeacherCycle> getAllTeacherCycles() {
    return teacherCycleRepository.findAll();
  }

  public TeacherCycle createTeacherCycle(TeacherCycle teacherCycle) {
    return teacherCycleRepository.save(teacherCycle);
  }
}