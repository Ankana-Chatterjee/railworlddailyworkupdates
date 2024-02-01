package com.practice.logout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LogoutController {
	@GetMapping("/logout")
	@ResponseBody
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "logout successfully"; // Redirect to your login page
	}
}
