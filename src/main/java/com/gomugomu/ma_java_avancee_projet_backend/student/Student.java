package com.gomugomu.ma_java_avancee_projet_backend.student;

import com.gomugomu.ma_java_avancee_projet_backend.user.User;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;
import com.gomugomu.ma_java_avancee_projet_backend.exam.Exam;
import com.gomugomu.ma_java_avancee_projet_backend.parent.Parent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@EqualsAndHashCode(callSuper = false)
public class Student extends BasePrimary {

  @Column(nullable = false)
  private String cne;

  @Column(unique = true)
  private String cin;

  @Column
  private String phone;

  @Column(name = "\"firstName\"", nullable = false)
  private String firstName;

  @Column(name = "\"lastName\"", nullable = false)
  private String lastName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "\"userId\"", referencedColumnName = "id")
  private User user;

  @ManyToMany(mappedBy = "children")
  private List<Parent> parents;

  @ManyToMany(mappedBy = "students", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
      CascadeType.REFRESH })
  private List<Exam> exams;
}