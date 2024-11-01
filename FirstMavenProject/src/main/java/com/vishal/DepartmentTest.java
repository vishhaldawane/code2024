package com.vishal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DepartmentTest {

	public static void main(String[] args) {
		//key and value = hashmap
		StandardServiceRegistry ssr = new
					StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
		System.out.println("Service registry is created..."+ssr);
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("Metadata : "+meta);
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		System.out.println("Factory : "+factory);
		
		Session session = factory.openSession();
		System.out.println("Session : "+session);
		
		Transaction trans = session.beginTransaction();
		System.out.println("Transaction started....");
		
				Department dept = new Department();
				System.out.println("Pojo instance created....");
				
				dept.setDepartmentNumber(20);
				dept.setDepartmentName("Research");
				dept.setDepartmentLocation("Pune");
				
				Department dept2 = new Department();
				System.out.println("Pojo instance created....");
				
				dept2.setDepartmentNumber(30);
				dept2.setDepartmentName("Sales");
				dept2.setDepartmentLocation("UP");
				
				Department dept3 = new Department();
				System.out.println("Pojo instance created....");
				
				dept3.setDepartmentNumber(40);
				dept3.setDepartmentName("Operations");
				dept3.setDepartmentLocation("MP");
				
				
				System.out.println("Pojo instance fillup with values...");
				
				session.save(dept); // fire the insert query here
				session.save(dept2); // fire the insert query here
				session.save(dept3); // fire the insert query here
				
				
		System.out.println("Object saved : insert query fired....");
		
		trans.commit();
		System.out.println("Transaction committed....");
		
		session.close();
		System.out.println("Session closed...");
		
		factory.close();
		System.out.println("Factory closed...");
		
	}

}
