import java.util.Scanner;


public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight : ");
		int weight = scan.nextInt();
		Running run = new Running();
		try {
			
		
			if(run.inOrOut(weight)) {
			System.out.println("Valid weight");
			}
		}
		catch(WeightException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
		
	}

}
//checked
class WeightException extends Exception
{
	WeightException(String msg) { //ctor
		super(msg);
	}
}


class Running
{
	boolean inOrOut(int weight) throws WeightException
	{
		if(weight >=50 && weight <=70)
			return true;
		else
			throw new WeightException("Weight is NOT suitable for Running....");
		
	}
}








