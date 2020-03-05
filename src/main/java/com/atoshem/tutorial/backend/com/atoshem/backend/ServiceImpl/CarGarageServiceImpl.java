package com.atoshem.tutorial.backend.com.atoshem.backend.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atoshem.tutorial.backend.com.atoshem.backend.Repository.CarGarage;
import com.atoshem.tutorial.backend.com.atoshem.backend.Repository.CarRepository;
import com.atoshem.tutorial.backend.com.atoshem.backend.Service.CarGarageService;

@Service
public class CarGarageServiceImpl implements CarGarageService {

	@Autowired
	CarRepository carRepository;
	
	@Override
	public List<CarGarage> getAllCars() {
		return (List<CarGarage>) carRepository.findAll();
	}

	@Override
	public void deleteCarById(Integer id) {
		CarGarage car = carRepository.findById(id).get();
		carRepository.delete(car);
	}

	
}
