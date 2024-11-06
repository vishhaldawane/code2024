package com.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
	
		System.out.println("Creating application context....");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("mySpring.xml");
		System.out.println("Application context created : "+context);
		
		System.out.println("---------");

		
		Reception recept1 = (Reception) context.getBean("myReception");
		Reception recept2 = (Reception) context.getBean("myReception");
		Reception recept3 = (Reception) context.getBean("myReception");

		System.out.println("reception 1 "+recept1);
		System.out.println("reception 2 "+recept2);
		System.out.println("reception 3 "+recept3);
		
		System.out.println("---------");
		
		Room room1 = (Room) context.getBean("myRoom");
		Room room2 = (Room) context.getBean("myRoom");
		Room room3 = (Room) context.getBean("myRoom"); //load the object by its name/id

		System.out.println("room 1 "+room1);
		System.out.println("room 2 "+room2);
		System.out.println("room 3 "+room3);
		System.out.println("---------");

		Car car1 = context.getBean(Car.class); //load the object by its TYPE
		System.out.println("car1  : "+car1); 
		
		Car car2 = context.getBean(Car.class);
		System.out.println("car2  : "+car2); 
		
		Car car3 = context.getBean(Car.class);
		System.out.println("car3  : "+car3); 
		
		
		
		
		

	}

}






