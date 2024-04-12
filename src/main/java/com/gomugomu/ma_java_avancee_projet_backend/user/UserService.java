package com.gomugomu.ma_java_avancee_projet_backend.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service
public class UserService {

  @Value("${config.pagination.size}")
  private byte paginationSize;

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public Page<User> getAllUsers(Integer page) {
    return userRepository.findAll(PageRequest.of(page, this.paginationSize));
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }
}