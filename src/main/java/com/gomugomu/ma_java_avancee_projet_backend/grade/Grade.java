package com.gomugomu.ma_java_avancee_projet_backend.grade;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.classs.Class;
import com.gomugomu.ma_java_avancee_projet_backend.sector.Sector;
import com.gomugomu.ma_java_avancee_projet_backend.subject.Subject;
import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grades")
@EqualsAndHashCode(callSuper = false)
public class Grade extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private short level;

  @JoinColumn(name = "\"sectorId\"")
  @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Sector sector;

  @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(name = "\"gradeSubjects\"", joinColumns = @JoinColumn(name = "\"gradeId\""), inverseJoinColumns = @JoinColumn(name = "\"subjectId\""))
  private List<Subject> subjects;

  @OneToMany(mappedBy = "grade", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
      CascadeType.REFRESH })
  private List<Class> classes;
}
