package com.vishal.cars3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.cars3.Car;

public class SpringApp4 {

	public static void main(String[] args) {
	
		System.out.println("Creating application context....");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("mySpring4.xml");
		System.out.println("Application context created : "+context);
		
		System.out.println("---------");

		//inversion of control  OR dependency injection
		

		Car car1 = context.getBean(Car.class); //load the object by its TYPE
		System.out.println("car1  : "+car1); 
		
		
		
		

	}

}






