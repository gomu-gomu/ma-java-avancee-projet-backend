package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Teacher;
import com.gomugomu.ma_java_avancee_projet_backend.repository.TeacherRepository;



@Service
public class TeacherService {

  private TeacherRepository teacherRepository;

  @Autowired
  public TeacherService(TeacherRepository teacherRepository) {
    this.teacherRepository = teacherRepository;
  }

  public List<Teacher> getAllTeachers() {
    return teacherRepository.findAll();
  }

  public Teacher createTeacher(Teacher teacher) {
    return teacherRepository.save(teacher);
  }
}