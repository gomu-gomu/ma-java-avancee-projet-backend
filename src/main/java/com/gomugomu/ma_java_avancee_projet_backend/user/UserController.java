package com.gomugomu.ma_java_avancee_projet_backend.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @DeleteMapping("")
  public ResponseEntity<Boolean> deleteUser(@RequestBody User user) {
    userService.deleteUser(user);
    return ResponseEntity.ok(true);
  }

  @PostMapping("")
  public ResponseEntity<User> createUser(@RequestBody User user) {
    User createdUser = userService.createUser(user);
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
  }

  @GetMapping("/page/{page}")
  public ResponseEntity<Page<User>> getAllUsersPage(
      @PathVariable Integer page,
      @RequestParam(required = false) String q,
      @RequestParam(required = false) List<Integer> types,
      @RequestParam(required = false) String sort,
      @RequestParam(required = false) String order) {
    Page<User> users = userService.getAllUsers(page, q, types, sort, order);
    return ResponseEntity.ok(users);
  }
}