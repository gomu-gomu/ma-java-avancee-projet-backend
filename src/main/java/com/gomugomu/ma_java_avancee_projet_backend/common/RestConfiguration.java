package com.gomugomu.ma_java_avancee_projet_backend.common;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;

@Component
public class RestConfiguration implements RepositoryRestConfigurer {

  @Autowired
  private EntityManager entityManager;

  @Bean
  public RepositoryRestConfigurer repositoryRestConfigurer() {
    return RepositoryRestConfigurer.withConfig(config -> config.exposeIdsFor(
        entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new)));
  }
}