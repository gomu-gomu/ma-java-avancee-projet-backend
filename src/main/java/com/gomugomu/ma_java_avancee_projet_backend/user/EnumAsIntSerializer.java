package com.gomugomu.ma_java_avancee_projet_backend.user;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class EnumAsIntSerializer extends JsonSerializer<Enum<?>> {
  @Override
  public void serialize(Enum<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
    if (value != null) {
      gen.writeNumber(value.ordinal());
    }
  }
}