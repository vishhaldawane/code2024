package com.vishal.onetoone;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OneToOneTestCases {


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
	public void insertNewEmployeeWithoutPassportTest() {
		
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
	public void insertNewPassportWithoutEmployeeTest() {
		
		System.out.println("Just running...");
	
		Passport pass = new Passport();
		pass.setPassportHolderName("Julie Dmello");
		pass.setDateOfBirth(LocalDate.of(2003, 11, 23));
		pass.setPassportIssuedOn(LocalDate.of(2021, 6, 24));
		pass.setPassportExpiryOn(LocalDate.of(2031, 6, 24));
			
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(pass);
		trans.commit();
	}
	
	@Test
	public void assignExistingPassportToExistingEmployeeTest() {
		
		EntityTransaction trans = entityManager.getTransaction();
		
		trans.begin();

		Employee emp  = entityManager.find(Employee.class, 6);
		Passport pass = entityManager.find(Passport.class, 7);
		
		emp.setPassport(pass);//technically filling the foreign key, ie pno
		entityManager.merge(emp);
		
		trans.commit();
		
	}
	
	@Test
	public void showEmployeeWithPassportTest()
	{
		Employee emp  = entityManager.find(Employee.class, 6);
		
		System.out.println("EMP NO   : "+emp.getEmployeeNumber());
		System.out.println("EMP NAME : "+emp.getEmployeeName());
		System.out.println("EMP SAL  : "+emp.getEmployeeSalary());
		Passport pass = emp.getPassport();
		System.out.println("PAssport NO     : "+pass.getPassportNumber());
		System.out.println("PAssport Holder : "+pass.getPassportHolderName());
		System.out.println("PAssport DOB    : "+pass.getDateOfBirth());
		System.out.println("PAssport ISSUED : "+pass.getPassportIssuedOn());
		System.out.println("PAssport EXPIRY : "+pass.getPassportExpiryOn());
		
		
	}
	
	
	@Test
	public void showPassportWithEmployeeTest()
	{
		Passport pass  = entityManager.find(Passport.class, 5);
		System.out.println("PAssport NO     : "+pass.getPassportNumber());
		System.out.println("PAssport Holder : "+pass.getPassportHolderName());
		System.out.println("PAssport DOB    : "+pass.getDateOfBirth());
		System.out.println("PAssport ISSUED : "+pass.getPassportIssuedOn());
		System.out.println("PAssport EXPIRY : "+pass.getPassportExpiryOn());
		
		Employee emp = pass.getEmployee();
		
		System.out.println("EMP NO   : "+emp.getEmployeeNumber());
		System.out.println("EMP NAME : "+emp.getEmployeeName());
		System.out.println("EMP SAL  : "+emp.getEmployeeSalary());
	
		
	}
	
	@Test
	public void addNewEmployeeWithNewPassportTest()
	{
		Employee emp = new Employee();
		emp.setEmployeeName("PETER");
		emp.setEmployeeSalary(7000);
		
		Passport pass = new Passport();
		pass.setPassportHolderName("PETER DCUNHA");
		pass.setDateOfBirth(LocalDate.of(2004, 10, 20));
		pass.setPassportIssuedOn(LocalDate.of(2023, 7, 22));
		pass.setPassportExpiryOn(LocalDate.of(2033, 7, 22));
	
		emp.setPassport(pass);
		
		EntityTransaction trans = entityManager.getTransaction();
		
		trans.begin();
			entityManager.persist(emp);
		trans.commit();
	}
	
}









