package com.atoshem.tutorial.backend.com.atoshem.backend.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarGarage, Integer>{

	List<CarGarage> findByModel(String carModel);
	
}
