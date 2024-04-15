package com.gomugomu.ma_java_avancee_projet_backend.exam;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.cycle.Cycle;
import com.gomugomu.ma_java_avancee_projet_backend.student.Student;
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
@Table(name = "exams")
@EqualsAndHashCode(callSuper = false)
public class Exam extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @JoinColumn(name = "\"subjectId\"", referencedColumnName = "id")
  @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Subject subject;

  @JoinColumn(name = "\"cycleId\"", referencedColumnName = "id")
  @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Cycle cycle;

  @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(name = "\"studentExams\"", joinColumns = @JoinColumn(name = "\"examId\""), inverseJoinColumns = @JoinColumn(name = "\"studentId\""))
  private List<Student> students;
}
