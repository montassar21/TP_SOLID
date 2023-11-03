package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
	   CarDbManipulation carsDb;
   
   
   
    public CarManager(CarDbManipulation carsDb) {
    	this.carsDb = carsDb;

}


public String getCarNames() {
	 StringBuilder sb = new StringBuilder();
     for (Car car : carsDb.get_carsDb()) {
         sb.append(car.getBrand());
         sb.append(" ");
         sb.append(car.getModel());
         sb.append(", ");
     }
     return sb.substring(0, sb.length() - 2);
}

public Car bestCar() {
	
    Car bestCar = null;
    for (Car car : carsDb.get_carsDb()) {
        if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
            bestCar = car;
        }
    }
    return bestCar;
}

}