import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream = flow -- water input at your home

// mainpipe --> water
// washroom, shower, basin, flush tank -> press lever-> , 
// taps
// garden, fountains, water-inlets for plants

//1gb movie stored in a HDD
//on a website
//		|
//		|movie's data is sent to the customer in
//		|the form of stream (flow)
//	--------------
//	|	|	|	|
//  c1  c2  c3  c4
// 1-60 1-60 1-60 1-60
// 20   5     30   45

// - stream api is used to process the collections
// collection = container - to hold objects

/*
 	The objects stored in the collection/container
 	we need certain activities on it to perform
 	
 	1. filtering - (e)->e.empno>5
 	2. mapping of it - map((e)->e.salary).reduce(0.0,Double::sum)
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
						Game   Score  Account
  		2. Terminate
  			new Cow().milkACow().coagulate().churn(5);
  				              Milk        Curd
  				              
  	  
 */
class BankAccount { }
class Executive extends Employee { }
public class StreamTest {
	public static void main(String[] args) {
		Employee staff[] =  {
				new Employee(8,"Julie",5000),
				new Employee(15,"Jane",6000),
				new Employee(22,"Amit",7000),
				new Employee(29,"Robert",4000),	
				new Employee(36,"Robert",4000),	
				new Employee(50,"Bharat",3000),	
			//	new Executive()
		};
		
		//array is of limited size
		//cannot grow or shrink
		//can hold only one type value, or its children
		
		//for(int i=0;i<staff.length;i++) {
		//	System.out.println(staff[i]);
		//}
		try {
			
		//		staff[0] = new Employee(101,"Julie",5000); 
		//		staff[1] = new Employee(103,"Raj",5000); 
		//		staff[2] = new Employee(108,"Julie",8000); 
				
			
			
			Stream<Employee> empStream = Stream.of(staff);
			empStream.forEach(  emp->System.out.println(emp)  );
		
		
		System.out.println("-------");
		
	/*	List<Employee> empList= new ArrayList<Employee>();
		for(int i=0;i<staff.length;i++) {
			empList.add(staff[i]);			
		}
	*/	
		List<Employee> empList = Stream.of(staff).collect(Collectors.toList());
		long rows = empList.stream().count();
		System.out.println("COUNT "+rows);
		//	List<Employee> empList = empStream.collect(Collectors.toList());

		empList.forEach(x->System.out.println(x));
			
		System.out.println("-----------");
		
		//intermediate list of emp's having empno>100 with ename start with J
		List<Employee> emps = Stream.of(staff).
				filter(e->e.empno>100 && e.empname.startsWith("J")).
				collect(Collectors.toList());
		
		/*
			annonymous function
			
				(x)-> { x.empno>100 }
		*/
		emps.forEach(x->System.out.println(x));

		System.out.println("-----------");

		Stream.of(staff).
		filter(e->e.salary>5000).
		forEach(x->System.out.println(x));

		System.out.println("-----------");
		double cost = Stream.of(staff).
				filter(e->e.empno>102).
				map(e->e.salary).
				reduce(0.0,Double::sum);
		
		//7000 4000 3000 <-- map is having 3 values to focus upon
		//double sum=0;
		// sum = sum + 7000;
		// sum = sum+ 4000
		// sum = sum + 3000;
		//return sum;
		
		System.out.println("Cost : "+cost);
		
		//filter(e->e.salary>5000).forEach(x->System.out.println(x));
		
		System.out.println("Emp with empno > 100 and name start with J ");
		Stream.of(staff).
				filter(e->e.empno>100 && e.empname.startsWith("J")).forEach(x->System.out.println(x));
		
		
		System.out.println("FIRST EMP with empno > 100 and name start with J ");
		Employee firstEmp = 
				Stream.of(staff).
				filter(e->e.empno>100 && e.empname.startsWith("J"))
				.findFirst().orElse(null);
				

			System.out.println("emp "+firstEmp);
		
		
			System.out.println("Sorted employees - by empno ");
			Stream.of(staff).sorted((e1,e2)->Integer.compare(e1.empno, e2.empno))		
			.forEach(x->System.out.println(x));
			
			System.out.println("\nSorted employees - by empname ");
			Stream.of(staff).sorted((e1,e2)->e1.empname.compareTo(e2.empname))		
			.forEach(x->System.out.println(x));
			
			System.out.println("\nSorted employees - by salary ");
			Stream.of(staff).sorted((e1,e2)-> Double.compare(e1.salary, e2.salary))		
			.forEach(x->System.out.println(x));
			
			
			Employee emp1  = Stream.of(staff).min((e1,e2)->e1.empno-e2.empno).get();
			System.out.println("Emp with lowest empno : "+emp1);
			
			Employee emp2  = Stream.of(staff).max((e1,e2)->e1.empno-e2.empno).get();
			System.out.println("Emp with highest empno : "+emp2);					
		
			System.out.println("-------distinct emp-----");
			List<Employee> distEmp  = Stream.of(staff).distinct().collect(Collectors.toList());
			
			distEmp.forEach((e)->System.out.println(e));

			if(Stream.of(staff).allMatch(e->e.empno%2==0)) {
				System.out.println("All Emp's empno is divisible by 2");
			}
			else {
				System.out.println("not all Emp's empno is divisble by 2");
			}
			System.out.println("-----------");
			if(Stream.of(staff).anyMatch(e->e.empno%5==0)) {
				System.out.println("Few Emp's empno is divisible by 5");
			}
			else {
				System.out.println("not all Emp's empno is divisble by 5");
			}
			System.out.println("-----------");
			if(Stream.of(staff).noneMatch(e->e.empno%7==0)) {
				System.out.println("No Emp's empno is divisible by 7");
			}
			else {
				System.out.println("Few Emp's empno is divisble by 7");
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("Container is empty...");
		}
	}
}

class Employee
{
	int empno;
	String empname;
	double salary;
	
	Employee() { }
	
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

	@Override
	public int hashCode() {
		return Objects.hash(empno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empno == other.empno;
	}
	
	
}
