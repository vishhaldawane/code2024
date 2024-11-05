package com.vishal;
//persistence = storing the data on the database

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartmentMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		//the above line would read the file META-INF\persistence.xml
		//and will search for MyJPA as a persistence unit and its details
	
		//What is entity? = the one with primary key
		EntityManager entityManager = factory.createEntityManager();
		
		Department dept = new Department();
		dept.setDeptNumber(20);
		dept.setDeptName("Exam");
		dept.setDeptLocation("New Mumbai");
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(dept);
		trans.commit();

	}

}
