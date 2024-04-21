package com.gomugomu.ma_java_avancee_projet_backend.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = EnumAsIntSerializer.class)
public enum UserType {
  ADMIN((byte) 0),
  TEACHER((byte) 1),
  PARENT((byte) 2),
  STUDENT((byte) 3);

  private byte value;

  UserType(byte type) {
    this.value = type;
  }

  public byte getValue() {
    return this.value;
  }

  public String getRole() {
    return String.valueOf(this.value);
  }
}