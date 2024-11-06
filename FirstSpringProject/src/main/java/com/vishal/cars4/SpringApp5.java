package com.vishal.cars4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.cars4.Car;

public class SpringApp5 {

	public static void main(String[] args) {
	
		System.out.println("Creating application context....");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("mySpring5.xml");
		System.out.println("Application context created : "+context);
		
		System.out.println("---------");

		//inversion of control  OR dependency injection
		
		Car car1 = context.getBean(Car.class); //load the object by its TYPE
		System.out.println("car1  : "+car1); 
		
		car1.startCar(); // it will invoke ref.startEngine()
		
		
		

	}

}






