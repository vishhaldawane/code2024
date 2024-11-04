import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vishal.Department;

public class DepartmentTesting {
	
	
	SessionFactory factory; // global variable for all
					//test cases
	
	@BeforeEach
	public void setup() {
		StandardServiceRegistry ssr = new
				StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		System.out.println("Service registry is created..."+ssr);
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("Metadata : "+meta);
		
		factory = meta.getSessionFactoryBuilder().build();
		System.out.println("Factory : "+factory);
		
	}
	
	@Test
	public void selectAllTest() {
		//key and value = hashmap
				
				Session session = factory.openSession();
				System.out.println("Session : "+session);
							
					//query created for the Department POJO				//HQL (from POJO)  vs SQL (select *  from dept5)
						TypedQuery<Department> query = session.createQuery("from Department", Department.class);
						
						
						Assertions.assertTrue(query!=null);
						
						System.out.println("Select Query created...");

						List<Department> listDepts = query.getResultList();
						
						Assertions.assertTrue(listDepts.size() > 0);
						System.out.println("Found records in the list....");
						
						for(Department dept : listDepts) {
							System.out.println("DEPTNO : "+dept.getDepartmentNumber());
							System.out.println("DNAME  : "+dept.getDepartmentName());
							System.out.println("DLOC   : "+dept.getDepartmentLocation());
						}
						
				
				
				session.close();
				System.out.println("Session closed...");
				
				factory.close();
				System.out.println("Factory closed...");
				
	}
	
	@Test
	public void selectTest() {
		//key and value = hashmap
				
				Session session = factory.openSession();
				System.out.println("Session : "+session);
				
				
						Department dept = session.get(Department.class, 20);
						
						
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
