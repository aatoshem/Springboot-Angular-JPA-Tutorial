package com.atoshem.tutorial.backend.com.atoshem.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atoshem.tutorial.backend.com.atoshem.backend.Repository.CarGarage;
import com.atoshem.tutorial.backend.com.atoshem.backend.Service.CarGarageService;

@RestController
public class CarGarageController {
	
	@Autowired
	CarGarageService carGarageService;
	
	@GetMapping("/car")
	public void deleteById(@RequestParam Integer id) {
      carGarageService.deleteCarById(id);
	}
	
	@GetMapping("/")
	public List<CarGarage> getAllCars() {
		return carGarageService.getAllCars();
	}
}
