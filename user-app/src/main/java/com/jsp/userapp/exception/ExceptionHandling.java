package com.jsp.userapp.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.userapp.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<ResponseStructure<String>> userException(UserException e) {
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		structure.setMessage("error occured");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseStructure<String>> exception(Exception e) {
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		structure.setMessage("error occured");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> validation(MethodArgumentNotValidException e) {
		Map<String, String> map=new HashMap<String,String>();
		List<ObjectError> allError=e.getAllErrors();
		for(ObjectError objectError:allError) {
			FieldError error=(FieldError) objectError;
			map.put(error.getField(), objectError.getDefaultMessage());
		}
		return new ResponseEntity<Map<String,String>>(HttpStatus.BAD_REQUEST);
	}
}
