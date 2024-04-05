package com.gomugomu.ma_java_avancee_projet_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gomugomu.ma_java_avancee_projet_backend.model.Parenthood;
import com.gomugomu.ma_java_avancee_projet_backend.service.ParenthoodService;



@RestController
public class ParenthoodController {

  private final ParenthoodService parenthoodService;

  @Autowired
  public ParenthoodController(ParenthoodService parenthoodService) {
    this.parenthoodService = parenthoodService;
  }

  @GetMapping("/parenthoods")
    public ResponseEntity<List<Parenthood>> getAllParenthood() {
      List<Parenthood> parenthoods = parenthoodService.getAllparenthoods();
      return ResponseEntity.ok(parenthoods);
  }

  @PostMapping("/parenthood")
  public ResponseEntity<Parenthood> createParenthood(@RequestBody Parenthood parenthood) {
    Parenthood createdParenthood = parenthoodService.createParenthood(parenthood);
    return new ResponseEntity<>(createdParenthood, HttpStatus.CREATED);
  }
}