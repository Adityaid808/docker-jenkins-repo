package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	

	@GetMapping("/getMessage")
	public String getMsg() {
		
		return "Hello CI/CD Pipeline with jenkins and docker...!!";
	}
}
