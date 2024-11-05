import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vishal.Department;

public class JpaTestCases {

	EntityManager entityManager ;
	
	@BeforeEach
	public void setSomething() {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		//the above line would read the file META-INF\persistence.xml
		//and will search for MyJPA as a persistence unit and its details
	
		//What is entity? = the one with primary key
		entityManager = factory.createEntityManager();
		
		
	}
	
	@Test
	public void insertTest() {
		
		
		Department dept = new Department();
		dept.setDeptNumber(30);
		dept.setDeptName("Passed");
		dept.setDeptLocation("WOW");
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(dept);
		trans.commit();

	}
	
	@Test
	public void updateTest() {
		
		
		Department dept = new Department();
		dept.setDeptNumber(30);
		dept.setDeptName("Research");
		dept.setDeptLocation("Pune");
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.merge(dept);
		trans.commit();

	}
	
	
	@Test
	public void deleteTest() {
		
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			Department dept = entityManager.find(Department.class, 30);
			entityManager.remove(dept);
		trans.commit();

	}
	
	
	@Test
	public void selectTest() {
				
			Department dept = entityManager.find(Department.class, 10);
		Assertions.assertTrue(dept!=null);
		
			System.out.println("Dept number : "+dept.getDeptNumber());
			System.out.println("Dept name   : "+dept.getDeptName());
			System.out.println("Dept loc    : "+dept.getDeptLocation());
			System.out.println("--------------");			
		

	}
	
	
	@Test
	public void selectAllTest() {
		
		EntityTransaction trans = entityManager.getTransaction();
																		//JPQL
		TypedQuery<Department> query = 
		entityManager.createQuery("from Department", Department.class);
		Assertions.assertTrue(query!=null);

			//100 items
		//typical for loop =  int i=50; i<=70;i++
			List<Department> deptList = query.getResultList();
				
			for(Department dept : deptList) {
				System.out.println("Dept number : "+dept.getDeptNumber());
				System.out.println("Dept name   : "+dept.getDeptName());
				System.out.println("Dept loc    : "+dept.getDeptLocation());
				System.out.println("--------------");			
			}

	}


}
