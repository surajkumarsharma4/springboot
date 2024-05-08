package com.jsp.firstspringboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
	//restController = responseBody+controller annotation --> use responseBody for every method
	@GetMapping("/get")
	public String getName() {
		return "hello spring boot get";
	}
	@PostMapping("/post")
	public String getPost() {
		return "hello spring boot post";
	}
	@DeleteMapping("/del ")
	public String getDelete() {
		return "hello spring boot delete";
	}
	@PutMapping("/put")
	public String getPut() {
		return "hello spring boot put";
	}
	@PatchMapping("/patch")
	public String getPatch() {
		return "hello spring boot patch";
	}
	
}
