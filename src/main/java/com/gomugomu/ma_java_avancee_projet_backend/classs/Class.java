package com.gomugomu.ma_java_avancee_projet_backend.classs;

import com.gomugomu.ma_java_avancee_projet_backend.grade.Grade;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;
import com.gomugomu.ma_java_avancee_projet_backend.cycle.Cycle;

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
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
@EqualsAndHashCode(callSuper = false)
public class Class extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @JoinColumn(name = "\"gradeId\"", referencedColumnName = "id")
  @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Grade grade;

  @OneToMany(mappedBy = "classs", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
      CascadeType.REFRESH })
  private List<Cycle> cycles;
}
