package com.gomugomu.ma_java_avancee_projet_backend.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = EnumAsIntSerializer.class)
public enum UserType {
  ADMIN,
  TEACHER,
  PARENT,
  STUDENT
}