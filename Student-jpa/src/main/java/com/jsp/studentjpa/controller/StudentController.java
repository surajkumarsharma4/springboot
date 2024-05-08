package com.jsp.studentjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.studentjpa.entity.Student;
import com.jsp.studentjpa.repository.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/savestudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@GetMapping("/studentById/{id}")
	public Optional<Student> findStudentById(@PathVariable int id) {
		return studentService.findStudentById(id);
	}
	
	@GetMapping("/findAllStudent")
	public List<Student> findAllStudent() {
		return studentService.findAllStudent();
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentService.deleteStudentById(id);
	}
	
}
