package com.jsp.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.springdatajpa.entity.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{	
	//--> Dao or repository are same
	//--> Integer == datatype of primary key
		
	//--> custom query or method
	
//	@Query("select c from Car c where brand=?1")
//	List<Car> findByBrand(String name);
}
