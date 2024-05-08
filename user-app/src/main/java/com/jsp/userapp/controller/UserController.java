package com.jsp.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.userapp.entity.User;
import com.jsp.userapp.service.UserService;
import com.jsp.userapp.util.ResponseStructure;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	@CrossOrigin
	public User saveUser(@Valid @RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/alluser")
	@CrossOrigin
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser() {
		return userService.findAllUser();
	}
	
	@GetMapping("findbyid/{id}")
	@CrossOrigin
	public ResponseEntity<ResponseStructure<User>> findById(@PathVariable int id) {
		return userService.findUserById(id);
	}
	
}
