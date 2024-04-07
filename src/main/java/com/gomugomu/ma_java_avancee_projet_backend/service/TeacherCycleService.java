package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.TeacherCycle;
import com.gomugomu.ma_java_avancee_projet_backend.repository.TeacherCycleRepository;



@Service
public class TeacherCycleService {

  private TeacherCycleRepository teacherCycleRepository;

  @Autowired
  public TeacherCycleService(TeacherCycleRepository teacherCycleRepository) {
    this.teacherCycleRepository = teacherCycleRepository;
  }

  public List<TeacherCycle> getAllTeacherCycles() {
    return teacherCycleRepository.findAll();
  }

  public TeacherCycle createTeacherCycle(TeacherCycle teacherCycle) {
    return teacherCycleRepository.save(teacherCycle);
  }
}