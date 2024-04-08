package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.model.Base;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parenthoods")
@IdClass(ParenthoodId.class)
@EqualsAndHashCode(callSuper = false)
public class Parenthood extends Base {

  @Id
  @Column(name = "\"parentId\"", nullable = false)
  private UUID parentId;

  @Id
  @Column(name = "\"studentId\"", nullable = false)
  private UUID studentId;
}
