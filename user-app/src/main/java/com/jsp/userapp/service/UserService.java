package com.jsp.userapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.userapp.entity.User;
import com.jsp.userapp.exception.UserException;
import com.jsp.userapp.repository.UserRepository;
import com.jsp.userapp.util.ResponseStructure;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User saveUser( User user) {
		return userRepository.save(user);
	}
	
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser() {
		ResponseStructure<List<User>>  structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.ACCEPTED.value());
		structure.setMessage("all the user data is given");
		structure.setData(userRepository.findAll());
		ResponseEntity<ResponseStructure<List<User>>> entity=new ResponseEntity<ResponseStructure<List<User>>>(structure, HttpStatus.ACCEPTED);
		return entity;
		
	}
	//--ResponseEntity is user to header status code
	//--> Response Structure is used for change status code,give message,and data of generic type
	
	
	public ResponseEntity<ResponseStructure<User>> findUserById(int id) {
		Optional<User> optional=userRepository.findById(id);
		if(optional.isPresent()) {
			User user=optional.get();
			ResponseStructure<User>  structure=new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.OK.value());
			structure.setMessage("user is found");
			structure.setData(user);
			ResponseEntity<ResponseStructure<User>> entity=new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.ACCEPTED);
			return entity;
		}
		else {
			throw new UserException("user not found");
		}
	}
	
//	public ResponseStructure<User> deleteUser(int id) {
//		ResponseStructure<List<User>>  structure=new ResponseStructure<>();
//		structure.setStatusCode(HttpStatus.ACCEPTED.value());
//		structure.setMessage("user is deleted");
//		structure.setData(userRepository.findAll());
//		return structure;
//	}
//	
}