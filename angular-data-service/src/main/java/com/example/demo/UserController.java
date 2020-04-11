package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Reques
	public String getUserDetails() {
		System.out.println("inside");
		return "vipin";
	}
}
