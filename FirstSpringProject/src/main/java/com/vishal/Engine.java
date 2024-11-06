package com.vishal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

	public Engine() {
		System.out.println("Engine ctor....");
	}
	
}
