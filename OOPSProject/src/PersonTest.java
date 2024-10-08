
public class PersonTest {
	public static void main(String[] args) {
		
		Person persona = new Person('F',20,"Ruchika");
		persona.showPerson();
		
		System.out.println("=================");
	
		Student student = new Student('F',20,"Seema",5566,"Bharathi Vidyapeeth","MCA",'A');
		student.showStudent();
	
		System.out.println("=================");
		
		Employee employee = new Employee('F',21,"Julie",1166,"Vidyalankar","BCA",'A', 1155,"IT","Developer",55000);
		employee.showEmployee();
	
	}
}		
class Person
{
	
	private char gender;
	private int age;
	private String name;
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	void showPerson()
	{
		System.out.println("--- PERSONAL DETAILS ---");
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
		System.out.println("-------------------------");
		
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Student extends Person
{
	int rollNumber;
	String collegeName;
	String stream;
	char grade;
	
	public Student(char gender, int age, String name, int rollNumber, String collegeName, String stream, char grade) {
		super(gender, age, name);
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
		this.grade = grade;
	}
	
	void showStudent()
	{
		super.showPerson();

		System.out.println("--- ACADEMIC DETAILS ---");
		System.out.println("RollNo : "+rollNumber);
		System.out.println("College: "+collegeName);
		System.out.println("Stream : "+stream);
		System.out.println("Grade  : "+grade);
		System.out.println("-------------------------");
		
	}
	
	
}



class Employee extends Student //isA
{
	int empNumber;
	String department;
	String designation;
	float salary;
	
	
	
	public Employee(char gender, int age, String name, int rollNumber, String collegeName, String stream, char grade,
			int empNumber, String department, String designation, float salary) {
		super(gender, age, name, rollNumber, collegeName, stream, grade);
		this.empNumber = empNumber;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}



	void showEmployee()
	{
		super.showStudent();

		System.out.println("--- EMPLOYEE DETAILS ---");
		System.out.println("EmpNo  : "+empNumber);
		System.out.println("Dept   : "+department);
		System.out.println("Desg   : "+designation);
		System.out.println("Salary : "+salary);
		System.out.println("-------------------------");
		
	}
	
	
}


