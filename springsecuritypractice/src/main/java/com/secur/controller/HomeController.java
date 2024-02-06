package com.secur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/")
public String index() {
	return "index";
}
@GetMapping("/about")
public String about() {
	return "about";
}
@GetMapping("/profile")
public String profile() {
	return "profile";
}
}
