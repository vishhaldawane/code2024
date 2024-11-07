package com.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeApp {
	public static void main(String[] args) {
		System.out.println("Creating application context....");
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Application context created : "+context);
		System.out.println("---------");
		College college = context.getBean("collegeBean",College.class);
		college.lecture();
		

	}

}






