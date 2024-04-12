package com.gomugomu.ma_java_avancee_projet_backend.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("")
  public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = userService.getAllUsers();
    return ResponseEntity.ok(users);
  }

  @PostMapping("")
  public ResponseEntity<User> createUser(@RequestBody User user) {
    User createdUser = userService.createUser(user);
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
  }

  @GetMapping("/page/{page}")
  public ResponseEntity<Page<User>> getAllUsersPage(@PathVariable Integer page) {
    Page<User> users = userService.getAllUsers(page);
    return ResponseEntity.ok(users);
  }
}