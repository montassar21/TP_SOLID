package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarDbManipulation {
	 private List<Car> _carsDb;

	public CarDbManipulation() {
		_carsDb =  Arrays
		        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
			            new Car("3", "Megane", "Renault"));
	}

	public List<Car> get_carsDb() {
		return _carsDb;
	}
	
	public Car getCarById(final String carId) {
		   for (Car car : _carsDb) {
	           if (car.getId().equals(carId)) {
	               return car;
	           }
	       }
	       return null;
	   }


	
	 
	
}
