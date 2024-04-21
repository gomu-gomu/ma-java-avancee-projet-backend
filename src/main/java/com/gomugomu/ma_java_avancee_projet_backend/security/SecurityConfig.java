package com.gomugomu.ma_java_avancee_projet_backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

  @Bean
  public InMemoryUserDetailsManager userDetailsManager() {
    UserDetails admin = User.builder().username(("admin")).password("{noop}pwd").roles("ADMIN").build();
    UserDetails teacher = User.builder().username(("teacher")).password("{noop}pwd").roles("TEACHER").build();
    UserDetails parent = User.builder().username(("parent")).password("{noop}pwd").roles("PARENT").build();
    UserDetails student = User.builder().username(("student")).password("{noop}pwd").roles("STUDENT").build();

    return new InMemoryUserDetailsManager(admin, teacher, parent, student);
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(configurer -> configurer
        .requestMatchers(HttpMethod.POST, "/api/auth/**").hasAnyRole("ADMIN", "TEACHER", "PARENT", "STUDENT")
        .anyRequest().hasRole("ADMIN"));

    http.httpBasic(Customizer.withDefaults());
    http.csrf(csrf -> csrf.disable());

    return http.build();
  }
}
