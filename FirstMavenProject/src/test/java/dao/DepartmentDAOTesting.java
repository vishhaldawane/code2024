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
