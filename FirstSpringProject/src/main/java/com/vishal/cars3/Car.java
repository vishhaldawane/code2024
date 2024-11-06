package com.vishal.cars3;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car(Engine e) {
		System.out.println("Car(Engine) ctor...");
	}
}
