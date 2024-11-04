package dao;

import java.util.List;

import com.vishal.Department;

public class DAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDAO dao = new DepartmentDAOImpl();
		
		
		List<Department> deptList = dao.selectAllDepartments();
		
		for(Department dept : deptList) {
			System.out.println("DEPT NO   : "+dept.getDepartmentNumber());
			System.out.println("DEPT NAME : "+dept.getDepartmentName());
			System.out.println("DEPT LOC  : "+dept.getDepartmentLocation());
			System.out.println("---------------");
		}
		
		/*Department dept = dao.selectDepartment(20);
		System.out.println("DEPT NO   : "+dept.getDepartmentNumber());
		System.out.println("DEPT NAME : "+dept.getDepartmentName());
		System.out.println("DEPT LOC  : "+dept.getDepartmentLocation());
		*/
		
		/*Department dept = new Department();
		dept.setDepartmentNumber(70);
		dept.setDepartmentName("DIWALI");
		dept.setDepartmentLocation("Vikhroli");
		
		dao.insertDepartment(dept);
		*/
		
		/*Department dept = new Department();
		dept.setDepartmentNumber(70);
		dept.setDepartmentName("Christmas");
		dept.setDepartmentLocation("London");
		
		dao.updateDepartment(dept);*/
		
	/*	try {
			dao.deleteDepartment(60);
		}
		catch(DepartmentNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	*/
		
			System.out.println("END MAIN....");
		
	}

}








