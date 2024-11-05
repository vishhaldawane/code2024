package com.vishal.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class OneToManyTestCases {
EntityManager entityManager ;
	
	@BeforeEach
	public void setUp() {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		//the above line would read the file META-INF\persistence.xml
		//and will search for MyJPA as a persistence unit and its details
	
		//What is entity? = the one with primary key
		entityManager = factory.createEntityManager();
		
		
	}
	
	@Test
	public void insertNewEmployeeWithoutAddresses() {
		
		System.out.println("Just running...");
	
		Employee emp = new Employee();
		emp.setEmployeeName("Julie");
		emp.setEmployeeSalary(6000);
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(emp);
		trans.commit();
	}
	@Test
	public void insertNewEmployeeWithAddresses() {
		
		System.out.println("Just running...");
	
		Employee emp = new Employee();
		emp.setEmployeeName("Jack");
		emp.setEmployeeSalary(7000);
		
		Address homeAddr = new Address();
		homeAddr.setArea("Sweet Home");
		homeAddr.setStreet("West Avenue");
		homeAddr.setPlace("Dadar West");
		homeAddr.setCity("Mumbai");
		homeAddr.setState("MAH");
		homeAddr.setCountry("India");
		homeAddr.setPincode("400020");
		
		Address officeAddr = new Address();
		officeAddr.setArea("Cap Gemini");
		officeAddr.setStreet("LBS Road");
		officeAddr.setPlace("Vikhroli West");
		officeAddr.setCity("Mumbai");
		officeAddr.setState("MAH");
		officeAddr.setCountry("India");
		officeAddr.setPincode("400050");
		
		emp.getAddresses().add(homeAddr);
		emp.getAddresses().add(officeAddr);
		
		homeAddr.setEmployee(emp);
		officeAddr.setEmployee(emp);
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(emp);
			entityManager.persist(homeAddr);
			entityManager.persist(officeAddr);
		trans.commit();
	}
}
