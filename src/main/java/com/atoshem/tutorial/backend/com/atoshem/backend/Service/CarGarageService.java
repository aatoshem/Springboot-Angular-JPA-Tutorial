package com.atoshem.tutorial.backend.com.atoshem.backend.Service;

import java.util.List;

import com.atoshem.tutorial.backend.com.atoshem.backend.Repository.CarGarage;

public interface CarGarageService {
	
	List<CarGarage> getAllCars();
	void deleteCarById(Integer id);
	
}
