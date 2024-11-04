package dao;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.vishal.Department;


//III
//implementation class - USING HIBERNATE SESSION FACTORY
public class DepartmentDAOImpl2 implements DepartmentDAO {
//Violin
	SessionFactory factory; 
	
	public DepartmentDAOImpl2() {
		StandardServiceRegistry ssr = new
				StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		System.out.println("Service registry is created..."+ssr);
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		System.out.println("Metadata : "+meta);
		
		factory = meta.getSessionFactoryBuilder().build();
		System.out.println("Factory : "+factory);
		
	}
	
	@Override
	public void insertDepartment(Department dept) {
		
		Session session = factory.openSession();
		System.out.println("Got the session...");
		Transaction trans = session.beginTransaction();
		
		
		System.out.println("Transaction started.....");

			session.save(dept);
			System.out.println("insert query fired....");
		trans.commit();
		System.out.println("Transaction committed....");
	
	}

	@Override
	public Department selectDepartment(int deptNumber) {
		Department dept = null;
		
		Session session = factory.openSession();
		System.out.println("Got the session...");
		dept = session.get(Department.class, deptNumber);
		return dept; //return to the invoker

	}

	@Override
	public List<Department> selectAllDepartments() {
		
		List<Department> deptList = null;

		Department dept = null;
		
		Session session = factory.openSession();
		System.out.println("Got the session...");
		
		TypedQuery<Department> query = session.createQuery("from Department", Department.class);
		
		System.out.println("Select Query created...");

		deptList = query.getResultList();
	
		return deptList; //return to the invoker
		
	}

	@Override
	public void updateDepartment(Department dept) {
		Session session = factory.openSession();
		System.out.println("Got the session...");
		
		Transaction trans = session.beginTransaction();
		
		
		System.out.println("Transaction started.....");

		session.update(dept);
			
		trans.commit(); //or trans.rollback() to revoke the data
	}
	
//Exception DepartmentNotFoundException is not compatible 
	//with throws clause in DepartmentDAO.deleteDepartment(int)
	
	@Override
	public void deleteDepartment(int deptNumber) throws DepartmentNotFoundException
	{
		Session session = factory.openSession();
		System.out.println("Got the session...");
		
		Transaction trans = session.beginTransaction();
		
		
		System.out.println("Transaction started.....");
		Department dept = session.get(Department.class,deptNumber);
		if(dept==null) {
			throw new DepartmentNotFoundException("This dept id does not exists "+deptNumber);
		}
		session.delete(dept);
			
		trans.commit(); 
		
	}

}
