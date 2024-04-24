package com.gomugomu.ma_java_avancee_projet_backend.dashboard;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.user.UserType;
import com.gomugomu.ma_java_avancee_projet_backend.user.UserRepository;
import com.gomugomu.ma_java_avancee_projet_backend.grade.GradeRepository;
import com.gomugomu.ma_java_avancee_projet_backend.cycle.CycleRepository;
import com.gomugomu.ma_java_avancee_projet_backend.classs.ClassRepository;
import com.gomugomu.ma_java_avancee_projet_backend.sector.SectorRepository;
import com.gomugomu.ma_java_avancee_projet_backend.subject.SubjectRepository;

@Service
public class DashboardService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private GradeRepository gradeRepository;

  @Autowired
  private CycleRepository cycleRepository;

  @Autowired
  private SectorRepository sectorRepository;

  @Autowired
  private SubjectRepository subjectRepository;

  @Autowired
  private ClassRepository classRepository;

  public DashboardCountResponse getCounts() {
    return DashboardCountResponse
        .builder()
        .cycles(cycleRepository.countYears())
        .grades(Math.toIntExact(gradeRepository.count()))
        .classes(Math.toIntExact(classRepository.count()))
        .sectors(Math.toIntExact(sectorRepository.count()))
        .admins(userRepository.countByType(UserType.ADMIN))
        .subjects(Math.toIntExact(subjectRepository.count()))
        .parents(userRepository.countByType(UserType.PARENT))
        .teachers(userRepository.countByType(UserType.TEACHER))
        .students(userRepository.countByType(UserType.STUDENT))
        .build();
  }
}
