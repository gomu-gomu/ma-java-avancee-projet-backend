package com.gomugomu.ma_java_avancee_projet_backend.teacher;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.user.User;
import com.gomugomu.ma_java_avancee_projet_backend.cycle.Cycle;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
@EqualsAndHashCode(callSuper = false)
public class Teacher extends BasePrimary {

  @Column(nullable = false, unique = true)
  private String cin;

  @Column(nullable = false)
  private String phone;

  @Column(name = "\"firstName\"", nullable = false)
  private String firstName;

  @Column(name = "\"lastName\"", nullable = false)
  private String lastName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "\"userId\"", referencedColumnName = "id")
  private User user;

  @JoinColumn(name = "\"subjectId\"", referencedColumnName = "id")
  @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Subject subject;

  @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(name = "\"teacherCycles\"", joinColumns = @JoinColumn(name = "\"teacherId\""), inverseJoinColumns = @JoinColumn(name = "\"cycleId\""))
  private List<Cycle> cycles;
}