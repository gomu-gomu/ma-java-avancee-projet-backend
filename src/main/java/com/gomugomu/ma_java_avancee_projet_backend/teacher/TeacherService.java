package com.gomugomu.ma_java_avancee_projet_backend.teacher;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TeacherService {

  @Autowired
  private TeacherRepository teacherRepository;

  public List<Teacher> getAllTeachers() {
    return teacherRepository.findAll();
  }

  public Teacher createTeacher(Teacher teacher) {
    return teacherRepository.save(teacher);
  }
}