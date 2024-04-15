package com.gomugomu.ma_java_avancee_projet_backend.subject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;
import com.gomugomu.ma_java_avancee_projet_backend.exam.Exam;
import com.gomugomu.ma_java_avancee_projet_backend.grade.Grade;
import com.gomugomu.ma_java_avancee_projet_backend.teacher.Teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
@EqualsAndHashCode(callSuper = false)
public class Subject extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @OneToMany(mappedBy = "subject")
  private List<Teacher> teachers;

  @ManyToMany(mappedBy = "subjects")
  private List<Grade> grades;

  @OneToMany(mappedBy = "subject")
  private List<Exam> exams;
}
