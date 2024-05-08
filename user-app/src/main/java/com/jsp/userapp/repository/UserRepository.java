package com.jsp.userapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.userapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
