package com.jsp.springbootsecond.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Driver {
	@GetMapping("get")
	public String getName() {
		return "get method";
	}
	@PostMapping("post")
	public String getPst() {
		return "post method";
	}
}
