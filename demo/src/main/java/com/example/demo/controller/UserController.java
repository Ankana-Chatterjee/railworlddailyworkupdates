package com.example.demo.controller;

import com.example.demo.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

	private List<User> users = new ArrayList<>();

	@GetMapping("/register")
	public User registerUser(@RequestBody @ModelAttribute User user) {
		users.add(user);
		System.out.println(users);
		return user;
	}
}
