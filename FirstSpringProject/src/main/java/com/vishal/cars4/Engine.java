package com.vishal.cars4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Engine {
	
	Piston ref;
	
	public Engine() {System.out.println("Engine() default ctor...");}
	
	@Autowired
	public void setPiston(Piston p) {
		System.out.println("setPiston(Piston) invoked... ");
		ref = p;
	}
	
	void startEngine() {
		System.out.println("Starting the engine...");
		ref.firePiston();
	}
}
