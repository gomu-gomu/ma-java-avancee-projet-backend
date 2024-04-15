package com.gomugomu.ma_java_avancee_projet_backend.user;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {

  @RestResource(path = "by-all", rel = "by-all")
  @Query("SELECT u FROM User u WHERE LOWER(u.email) LIKE LOWER(CONCAT('%', :email, '%')) AND u.type IN :types")
  Page<User> findByEmailContainingIgnoreCase(@Param("email") String email, @Param("types") List<Integer> types,
      Pageable pageable);
}