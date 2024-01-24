package com.practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.LoginRequest;

@RestController
public class AuthController {

 @GetMapping("/login")
 public String login(@RequestBody @ModelAttribute LoginRequest loginRequest) {
     // Basic authentication logic (for demonstration purposes)
     if ("ankana".equals(loginRequest.getUsername()) && "1234".equals(loginRequest.getPassword())) {
         return "Login successful!";
     } else {
         return "Invalid credentials!";
     }
 }
}

