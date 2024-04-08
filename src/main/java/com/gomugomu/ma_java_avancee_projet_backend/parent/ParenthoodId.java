package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.UUID;
import java.io.Serializable;

import lombok.Data;

@Data
class ParenthoodId implements Serializable {
  private UUID parentId;
  private UUID studentId;
}