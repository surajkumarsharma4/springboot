package com.jsp.studentjpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.studentjpa.entity.Student;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	public Student updateStudent(int id ,Student student) {
		student.setId(id);
		return studentRepository.save(student);
	}
	
	public Optional<Student> findStudentById( int id) {
		return studentRepository.findById(id);
	}
	
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}
	
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}