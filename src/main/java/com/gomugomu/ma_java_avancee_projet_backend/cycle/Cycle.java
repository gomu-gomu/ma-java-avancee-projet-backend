package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.exam.Exam;
import com.gomugomu.ma_java_avancee_projet_backend.classs.Class;
import com.gomugomu.ma_java_avancee_projet_backend.teacher.Teacher;
import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cycles")
@EqualsAndHashCode(callSuper = false)
public class Cycle extends BasePrimary {

  @Column(nullable = false)
  private short year;

  @ManyToMany(mappedBy = "cycles")
  private List<Teacher> teachers;

  @JoinColumn(name = "\"classId\"", referencedColumnName = "id")
  @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Class classs;

  @OneToMany(mappedBy = "cycle", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
      CascadeType.REFRESH })
  private List<Exam> exams;
}
