package com.atoshem.tutorial.backend.com.atoshem.backend.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cargarage")
public class CarGarage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="make")
	String make;
	
	@Column(name="model")
	String model;
	
	@Column(name="color")
	String color;
	
	@Column(name="year")
	String year;
	
	public CarGarage() {	
	}
	
	public CarGarage(String make, String model, String color, String year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	public void setModelNumber(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CarGarage [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", year=" + year
				+ "]";
	}
	
}
