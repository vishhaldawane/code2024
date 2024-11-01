import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vishal.Department;

public class DepartmentTesting {
	
	@Test
	public void selectTest() {
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
				
				
						Department dept = session.get(Department.class, 30);
						
						
						Assertions.assertTrue(dept!=null);
						
						System.out.println("Select Query Fired...");
						
						
						System.out.println("DEPTNO : "+dept.getDepartmentNumber());
						System.out.println("DNAME  : "+dept.getDepartmentName());
						System.out.println("DLOC   : "+dept.getDepartmentLocation());
						
						
				
				
				session.close();
				System.out.println("Session closed...");
				
				factory.close();
				System.out.println("Factory closed...");
				
	}
	
	
	@Test
	public void updateTest() {
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
				
				
				
						Department dept = session.get(Department.class, 30);
						
						System.out.println("Select Query Fired...");

						Assertions.assertTrue(dept!=null);

						System.out.println("SHOWING current values.....");
						System.out.println("DEPTNO : "+dept.getDepartmentNumber());
						System.out.println("DNAME  : "+dept.getDepartmentName());
						System.out.println("DLOC   : "+dept.getDepartmentLocation());
						
						System.out.println("Updating to new values....");
						dept.setDepartmentName("MARKETING");
						dept.setDepartmentLocation("Uttar Pradesh");
						
						session.update(dept);
						
						System.out.println("UPDATE Query Fired...");
						
						
						
				trans.commit();
				
				session.close();
				System.out.println("Session closed...");
				
				factory.close();
				System.out.println("Factory closed...");
				
	}
	
	
	@Test
	public void deleteTest() {
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
				
				
				
						Department dept = session.get(Department.class, 30);
						
						System.out.println("Select Query Fired...");

						Assertions.assertTrue(dept!=null);

						System.out.println("SHOWING current values.....");
						System.out.println("DEPTNO : "+dept.getDepartmentNumber());
						System.out.println("DNAME  : "+dept.getDepartmentName());
						System.out.println("DLOC   : "+dept.getDepartmentLocation());
						
						System.out.println("Deleting this object....");
						
						session.delete(dept);
						
						System.out.println("DELETE Query Fired...");
						
						
						
				trans.commit();
				
				session.close();
				System.out.println("Session closed...");
				
				factory.close();
				System.out.println("Factory closed...");
				
	}
	
	
	@Test
	public void insertTest() {
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
				
				dept.setDepartmentNumber(50);
				dept.setDepartmentName("Research");
				dept.setDepartmentLocation("Pune");
				
				System.out.println("Pojo instance fillup with values...");
				
				session.save(dept); // fire the insert query here
				
				
		System.out.println("Object saved : insert query fired....");
		
		trans.commit();
		System.out.println("Transaction committed....");
		
		session.close();
		System.out.println("Session closed...");
		
		factory.close();
		System.out.println("Factory closed...");
		
	}
}
