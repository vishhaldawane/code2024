
public class CustomExceptionTest {

	public static void main(String[] args) {

		System.out.println("begin main");
		Car myCar = new Car("BMW");
		myCar.drive();
		
		System.out.println("End main");

	}

}

class Car
{
	String modelName;
	boolean carKeyFound=false;
	
	Car(String m) {
		modelName = m;
		
		double val = Math.random()%10;
		
		if(val>0.95) { //sharp memory | u know where the keys are
			carKeyFound=true;
		}
		else if(val>0.10) { //weak memory | forgotten where the key is?
			carKeyFound=false;
		}

		
		if(carKeyFound==false) {
			RuntimeException ex = new RuntimeException("Car key not found....");
			throw ex; // exiting from this constructor....
			/// constructor call is incomplete, object wont be
			// created....
		}
		else {
			System.out.println("Car Key found....");
		}
	} //end of the constructor means completion of Car is successfull
	
	void drive()
	{
		System.out.println("STARTED THE CAR....");
		for(int i=1;i<=15;i++) {
			System.out.println("Driving..."+modelName+" Car "+i);
		}
	}
}