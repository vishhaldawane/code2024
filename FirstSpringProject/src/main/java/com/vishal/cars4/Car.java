package com.vishal.cars4;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() { System.out.println("Car() default ctor...");}
	//property name would be -> (set)E->(e)ngine
	public void setEngine(Engine e) {
		System.out.println("setEngine(Engine) invoked...");
	}
}
