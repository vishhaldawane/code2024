
public class InterfaceTest {

	public static void main(String[] args) {
			Person person = new Person();
			person.run();   person.walk();    person.eat();		
	}

}
interface Running // pure abstract class
{
	void run(); //abstract, public , final
}
interface Walking {
	void walk();
}
interface Eating {
	void eat();
}

class Person implements Running,Walking, Eating
{

	@Override
	public void eat() { //MANDATE
		// TODO Auto-generated method stub
		System.out.println("Person is eating....");
	}

	@Override
	public void walk() { //MANDATE
		// TODO Auto-generated method stub
		System.out.println("Person is walking....");

	}

	@Override
	public void run() {//MANDATE
		// TODO Auto-generated method stub
		System.out.println("Person is running....");
	}
	
}
