import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream = flow -- water input at your home

// mainpipe --> water
// washroom, shower, basin, flushtank -> press lever-> , 
// taps


// - stream api is used to process the collections
// collection = container - to hold objects

/*
 	The objects stored in the collection/container
 	we need certain activities on it to perform
 	
 	1. filtering
 	2. mapping of it
 	3. changes/reduction 
 	4. rearrangement - sorting
 	
 			Talking (Human)
 			 |
  	Object talk(Object)
  		|	      |
  	Account     Running (Car)
  (SavingsAccount)
  	
  	Features of Stream
  	
  			- it wont change the original data
  			- it has all pipelined activities
  			
  			
  		Operations in STREAM
  		1. intermediate
			student.fun().play().card().showBalance();
			
  		2. Terminate
  			new Cow().milkACow().coagulate().churn(5);
  		
  		
  
 */
public class StreamTest {
	public static void main(String[] args) {
		Employee staff[] = {
				new Employee(101,"Julie",5000),
				new Employee(102,"Jane",6000),
				new Employee(103,"Janet",7000),	
				new Employee(104,"Robert",4000),	
				new Employee(105,"Peter",3000),	
				
		};
		//for(int i=0;i<staff.length;i++) {
		//	System.out.println(staff[i]);
		//}
		Stream<Employee> empStream = Stream.of(staff);
		empStream.forEach(emp->System.out.println(emp));
		
		System.out.println("-------");
		
	/*	List<Employee> empList= new ArrayList<Employee>();
		for(int i=0;i<staff.length;i++) {
			empList.add(staff[i]);			
		}
	*/	
		List<Employee> empList = Stream.of(staff).collect(Collectors.toList());
	//	List<Employee> empList = empStream.collect(Collectors.toList());

		empList.forEach(x->System.out.println(x));
		
		System.out.println("-----------");
		
		List<Employee> emps = Stream.of(staff).filter(e->e.empno>100).collect(Collectors.toList());
		emps.forEach(x->System.out.println(x));

		System.out.println("-----------");

		Stream.of(staff).filter(e->e.salary>5000).forEach(x->System.out.println(x));

		System.out.println("-----------");
	}
}

class Employee
{
	int empno;
	String empname;
	double salary;
	
	public Employee(int empno, String empname, double salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}