package com.gomugomu.ma_java_avancee_projet_backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gomugomu.ma_java_avancee_projet_backend.model.User;
import com.gomugomu.ma_java_avancee_projet_backend.enums.UserType;



@Service
public class UserService {

  private List<User> userList;

  public UserService() {
    userList = new ArrayList<>();

    User user1 = new User("5460ee1e-4bcc-4280-ba4b-7e0843197c21", "test@gmail.com", "123", "John", "Doe", "02568932698", UserType.TEACHER);

    userList.addAll(Arrays.asList(user1));
  }

  public Optional<User> getUser(String id) {
    Optional<User> optional = Optional.empty();
    
    for (User user: userList) {
      if(user.getId().equals(id)){
        return Optional.of(user);
      }
    }

    return optional;
  }
}