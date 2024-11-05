package dao;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vishal.Department;


public class DepartmentDAOTesting {
	
	DepartmentDAO dao;
	
	@BeforeEach
	public void setup() {
		System.out.println("setting dao ");
		dao = new DepartmentDAOImpl2();
		System.out.println("dao set : "+dao);

	}
	
	@Test
	public void selectAllDaoTest() {
		List<Department> depts = dao.selectAllDepartments();
		
		Assertions.assertTrue(depts.size() > 0);
		System.out.println("Found records in the list....");
		
		for(Department dept : depts) {
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("DLOC   : "+dept.getDepartmentLocation());
		}
		
	}
	
	@Test
	public void insertDAOTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(60);
		dept.setDepartmentName("QMS");
		dept.setDepartmentLocation("Mumbai");
		dao.insertDepartment(dept);
	}
	
	
	@Test
	public void updateDAOTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(60);
		dept.setDepartmentName("Quality");
		dept.setDepartmentLocation("New Mumbai");
		dao.updateDepartment(dept);
	}
	
	@Test
	public void selectDAOTest() {
		Department dept = dao.selectDepartment(60);
		System.out.println("DEPTNO : "+dept.getDepartmentNumber());
		System.out.println("DNAME  : "+dept.getDepartmentName());
		System.out.println("DLOC   : "+dept.getDepartmentLocation());
	
	}
	
	//ask from bu : candidates trained by lnd should be able
	//to respond the questions asked by BU
	
	//should not spoon feeding
	
	//dont be as a helicopter parent
	
	//stage fear to be removed
	
	//lets start doing stage facing
	//asking questions like BU
	//respond to the queries
	
	//open your mouth...
	
	//lets be SMARTER
	
	//32 students = in a week let make 5 student to talk....
	//infront of others
	
	//CCA BU = testtac
	
	//spring data + jpa
	
	//concept to be cleared...although test is cleared
	
	//those who exited from bengaluru got a good testtac score
	//but couldnt clear the Mock round...from BU
	
	//let us change the way...to throw them in the water
	//and let them swim....you are their to watch them
	//instead of drowining
	
	
	//max 2 hours to evaluate them 
	
	//show the code, ask them questions around the code
	
	
	
	
	//too much spoon feeding
	//not able to respond questions
	//are they able to explain the code
	//what happens behind the scene
	
	@Test
	public void deleteDAOTest() {
		try {
			dao.deleteDepartment(70);
		} catch (DepartmentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("dao : "+e.getMessage());
		}
		
	}
}
