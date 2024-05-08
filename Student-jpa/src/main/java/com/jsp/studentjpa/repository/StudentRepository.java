package com.jsp.studentjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.studentjpa.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
