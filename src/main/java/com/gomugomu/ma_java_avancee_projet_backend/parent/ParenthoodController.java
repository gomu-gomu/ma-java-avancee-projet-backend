package com.gomugomu.ma_java_avancee_projet_backend.parent;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/parenthood")
public class ParenthoodController {

  @Autowired
  private ParenthoodService parenthoodService;

  @GetMapping("")
  public ResponseEntity<List<Parenthood>> getAllParenthoods() {
    List<Parenthood> parenthoods = parenthoodService.getAllParenthoods();
    return ResponseEntity.ok(parenthoods);
  }

  @PostMapping("")
  public ResponseEntity<Parenthood> createParenthood(@RequestBody Parenthood parenthood) {
    Parenthood createdParenthood = parenthoodService.createParenthood(parenthood);
    return new ResponseEntity<>(createdParenthood, HttpStatus.CREATED);
  }
}