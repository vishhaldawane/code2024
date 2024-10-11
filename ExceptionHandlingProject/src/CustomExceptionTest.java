
public class CustomExceptionTest {

	public static void main(String[] args) {

		System.out.println("begin main");
		
		Car myCar = null;
		
		try
		{
			myCar = new Car("BMW"); //this line is susceptible to throw runtime exception
			myCar.drive(); ////this line is susceptible to throw runtime exception
		}
		catch(Exception e) {
			System.out.println("Problem1  : "+e);
		}
		
		if(myCar == null) {
			System.out.println("Alternate travel arrangement is done....");
		}
		System.out.println("End main");

	}

}

class Car
{
	String modelName;
	boolean carKeyFound=false;
	
					//throws is compulsory since it is Checked
	Car(String m) throws Exception
	{
		modelName = m;
		
		double val = Math.random()%10;
		
		if(val>0.35) { //sharp memory | u know where the keys are
			carKeyFound=true;
		}
		else if(val<0.10) { //weak memory | forgotten where the key is?
			carKeyFound=false;
		}

		
		if(carKeyFound==false) {
			Exception ex = new Exception("Car key not found....");
			throw ex; // exiting from this constructor....
			/// constructor call is incomplete, object wont be
			// created....
		}
		else {
			System.out.println("Car Key found....");
		}
	} //end of the constructor means completion of Car is successfull
	

	void drive() //no need of throws clause - since it is unchecked
	{
		System.out.println("STARTED THE CAR....");
		for(int i=1;i<=50;i++) {
			System.out.println("Driving..."+modelName+" Car "+i);
			double val = Math.random()%10;
			if(val >= 0.98 ) {
				RuntimeException ex = new RuntimeException("Speed limit exceeded.......");
				throw ex;
			}
		}
	}
}