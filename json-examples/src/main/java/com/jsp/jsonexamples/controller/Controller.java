package com.jsp.jsonexamples.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.jsonexamples.entity.Student;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Controller {
//--> json file
	@PostMapping("/save")
	public Student student(@RequestBody Student student) {
		System.out.println(student);
		return student;
	}
	//--> for taking parameter from url
	@PostMapping("/home")
	public String home(@RequestParam("id") int i,@RequestParam String name) {
		System.out.println(name);	
		System.out.println(i);	
		return i+name;
	}
	//--> taking data from url
	@PostMapping("/add/{name}/{email}")
	public String home(@PathVariable String name,@PathVariable String email) {
		System.out.println(name);	
		System.out.println(email);
		return email+name;
	}	
	//--> taking data from header
	@PostMapping("/head")
	public String headers(@RequestHeader String name,@RequestHeader String email) {
		System.out.println(name);	
		System.out.println(email);
		return email+name;
	}
	
	//--> taking data from cookies
		//--> adding cookies
	@GetMapping("/coo")
	public String cokki(HttpServletResponse response) {
		Cookie cookie=new Cookie("name", "suraj");
		Cookie cookie1=new Cookie("email", "ansh@gmail.com");
		response.addCookie(cookie1);
		response.addCookie(cookie);
		return null;
	}
		//-->  fetching cookie
	@GetMapping("/cook")
	public String cookie(@CookieValue String name,@CookieValue String email) {
		System.out.println(name);	
		System.out.println(email);
		return email+name;
	}
	
	
}