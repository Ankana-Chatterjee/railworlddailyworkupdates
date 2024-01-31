package com.practice.controller;
import com.practice.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	 @PostMapping("/register")
	    public ResponseEntity<String> registerUser(@RequestBody User user) {
	        // Check if passwords match
	        if (!user.getPassword().equals(user.getConfirmPassword())) {
	            return ResponseEntity.badRequest().body("Passwords do not match");
	        }

	        // Your registration logic here (e.g., save user to the database)
	        return ResponseEntity.ok("User registered successfully");
	    }
	

}
