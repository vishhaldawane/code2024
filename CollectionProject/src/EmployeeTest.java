import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmpno(12323);
		emp1.setName("julie");
		
		Address homeAddr = new Address();
		homeAddr.setHouse("120");
		homeAddr.setStreet("West Avenue");
		homeAddr.setHouse("Sweet Home");
		homeAddr.setCity("Bhopal");
		homeAddr.setState("MP");
		homeAddr.setPin("462043");
		
		Address offAddr = new Address();
		offAddr.setHouse("220");
		offAddr.setStreet("East Avenue");
		offAddr.setHouse("Coding Home");
		offAddr.setCity("Vikhroli");
		offAddr.setState("Maharashtra");
		offAddr.setPin("400050");
		
		Address nativeAddr = new Address();
		nativeAddr.setHouse("620");
		nativeAddr.setStreet("South Avenue");
		nativeAddr.setHouse("Mera Ghar");
		nativeAddr.setCity("Agra");
		nativeAddr.setState("Delhi");
		nativeAddr.setPin("420070");
		
	//	emp1.addresses.add(homeAddr);
	//	emp1.addresses.add(offAddr);
	
		emp1.addAddress(homeAddr);
		emp1.addAddress(offAddr);
		emp1.addAddress(nativeAddr);

		emp1.printEmployee();
		
	}
}
class Employee
{
	private int empno;
	private String name;
	
	private ArrayList<Address> addressList = new ArrayList<Address>();
	
	
	void addAddress(Address newAddress) {
		 addressList.add(newAddress);
	}
	
	
	public int getEmpno() {
		return empno;
	}




	public void setEmpno(int empno) {
		this.empno = empno;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	void printEmployee() {
		System.out.println("empno : "+empno);
		System.out.println("empno : "+name);
		
		for(Address a : addressList) {
			System.out.println("Address : "+a);
		}

	}
}

class Address
{
	private String house;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pin;
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [house=" + house + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
	
	
}
