package com.gomugomu.ma_java_avancee_projet_backend.sector;

import java.util.List;

import com.gomugomu.ma_java_avancee_projet_backend.grade.Grade;
import com.gomugomu.ma_java_avancee_projet_backend.common.BasePrimary;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sectors")
@EqualsAndHashCode(callSuper = false)
public class Sector extends BasePrimary {

  @Column(nullable = false)
  private String name;

  @OneToMany(mappedBy = "sector", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
      CascadeType.REFRESH })
  private List<Grade> grades;
}
