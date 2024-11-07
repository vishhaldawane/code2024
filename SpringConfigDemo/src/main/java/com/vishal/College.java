package com.vishal;
//no @Component OR no <bean> tag description
public class College { // Student, Subject, ReportCard
	public void lecture() {
		System.out.println("College lecture going on...");
	}
}
/*
1. mySpring.xml --> <bean> tag
2. mySpring.xml -> <context:component-scan>
					with @Component annotation
					
3. @Configuration + @Bean

*/