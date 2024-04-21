package com.gomugomu.ma_java_avancee_projet_backend.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.web.SecurityFilterChain;

import com.gomugomu.ma_java_avancee_projet_backend.user.UserType;

import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsManager detailsManager(DataSource dataSource, PasswordEncoder noOpPasswordEncoder) {
    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

    jdbcUserDetailsManager.setUsersByUsernameQuery("select email, password, 1 as enabled from users where email=?");
    jdbcUserDetailsManager
        .setAuthoritiesByUsernameQuery("select email, concat('ROLE_', type), 1 as enabled from users where email=?");

    return jdbcUserDetailsManager;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(configurer -> configurer
        .requestMatchers(HttpMethod.POST, "/api/auth/**")
        .hasAnyRole(UserType.ADMIN.getRole(), UserType.TEACHER.getRole(), UserType.PARENT.getRole(),
            UserType.STUDENT.getRole())
        .anyRequest().hasRole(UserType.ADMIN.getRole()));

    http.httpBasic(Customizer.withDefaults());
    http.csrf(csrf -> csrf.disable());

    return http.build();
  }
}
