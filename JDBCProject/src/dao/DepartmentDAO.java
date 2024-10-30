package dao;

import java.util.List;

//II
public interface DepartmentDAO {
	//crud functions
	void insertDepartment(Department dept);      //C
	Department selectDepartment(int deptNumber); //R
	List<Department> selectAllDepartments();	 //R
	void updateDepartment(Department dept);      //U
	void deleteDepartment(int deptNumber) throws DepartmentNotFoundException ;       //D
}
