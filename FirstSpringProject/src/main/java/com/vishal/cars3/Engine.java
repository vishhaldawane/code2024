package com.vishal.cars3;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine(Piston p) {
		System.out.println("Engine(Piston) ctor... ");
	}
}
