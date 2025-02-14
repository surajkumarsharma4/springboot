package com.jsp.springdatajpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springdatajpa.entity.Car;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	
	public Car saveCar(Car car) {
		//--> for saving car
		return carRepository.save(car);
	}
	public Car updateCar(int id ,Car car) {
		car.setId(id);
		return carRepository.save(car);
	}
	
	public Optional<Car> findCarById( int id) {
		return carRepository.findById(id);
	}
	
	public List<Car> findAllCar() {
		return carRepository.findAll();
	}
	
	public void deleteCarById(int id) {
		carRepository.deleteById(id);
	}
	
	
	
	
//	public List<Car> findByBrand(String brand) {
//		return carRepository.findByBrand(brand);
//	}
	
	
}
