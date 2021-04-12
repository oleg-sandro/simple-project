package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
public class UserController {

  @GetMapping("/get/user/any")
  public ResponseEntity getAnyUser() {
    return ResponseEntity.ok(User.builder().username("oleg").password("qwerty").build());
  }
}
