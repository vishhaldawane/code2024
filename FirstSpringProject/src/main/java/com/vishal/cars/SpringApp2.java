package com.vishal.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.cars.Car;

public class SpringApp2 {

	public static void main(String[] args) {
	
		System.out.println("Creating application context....");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("mySpring2.xml");
		System.out.println("Application context created : "+context);
		
		System.out.println("---------");

		//inversion of control  OR dependency injection
		

		Car car1 = (Car) context.getBean("myCar"); //load the object by its TYPE
		System.out.println("car1  : "+car1); 
		
		
		
		

	}

}





