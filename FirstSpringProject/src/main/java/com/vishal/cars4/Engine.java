package com.vishal.cars4;

import org.springframework.stereotype.Component;

@Component

public class Engine {
	public Engine() {System.out.println("Engine() default ctor...");}
	public void setPiston(Piston p) {
		System.out.println("setPiston(Piston) invoked... ");
	}
}
