package com.directi.training.srp.exercise;


public class Test {
	public static void main(String[] args) {
		CarDbManipulation cars=new CarDbManipulation();
          
		CarManager manager=new CarManager(cars);
		
		System.out.println(cars.get_carsDb().get(0).getBrand());	
	    System.out.println(manager.getCarNames());
		System.out.println(cars.getCarById("2").getBrand());	

	}
	
}
