package com.vishal.cars4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	Engine ref; //null
	
	public Car() { System.out.println("Car() default ctor...");}
	//property name would be -> (set)E->(e)ngine
	
	@Autowired
	public void setEngine(Engine e) {
		System.out.println("setEngine(Engine) invoked...");
		ref = e;
	}
	
	void startCar() {
		System.out.println("Starting the car...");
		ref.startEngine();
	}
}
