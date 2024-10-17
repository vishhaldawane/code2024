import java.util.ArrayList;
import java.util.function.Consumer;

public class TestLambda2 {
	public static void main(String[] args) {
		
		//1
		Addition addition = new Addition();
		int a1 = addition.expression(10, 20);
		System.out.println("Sum : "+a1);

		//2
		MathActivity activity1 = new Addition();
		int a2 = activity1.expression(10, 20);
		System.out.println("Sum : "+a2);

		
		System.out.println("-----------");
		
		Multiplication mult = new Multiplication();
		int p1 = mult.expression(10, 20);
		System.out.println("Product : "+p1);

		MathActivity activity2 = new Multiplication();
		int p2= activity2.expression(10, 20);
		System.out.println("Product : "+p2);
		
		System.out.println("-----------");

		/*
		 class Addition implements MathActivity
		 {	
			public int expression(int x, int y) {
				return x+y;
			}
		 } 
		 */
		MathActivity activity3 = (a, b) -> a + b ;
		MathActivity activity4 = (x, y) -> x - y ;
		MathActivity activity5 = (p, q) -> p * q ;
		MathActivity activity6 = (x, y) -> x / y ;

		System.out.println(" "+activity3.expression(10, 20));
		System.out.println(" "+activity4.expression(100, 20));
		System.out.println(" "+activity5.expression(10, 20));
		System.out.println(" "+activity6.expression(100, 20));
		
		ArrayList<Integer> listOfNums = new ArrayList<Integer>();
		listOfNums.add(50);
		listOfNums.add(63);
		listOfNums.add(75);
		listOfNums.add(82);
		listOfNums.add(85);
		listOfNums.add(35);
		listOfNums.add(83);
		
		
		//1st implementation
		Consumer<Integer> activity7 = (n) -> { System.out.println(n); };
		
		//2nd implementation
		Consumer<Integer> activity8 = (n) -> { 
			if(n%5==0)
				System.out.println(n); 
		};
		
		//3rd implementation
		Consumer<Integer> activity9 = (n) -> { 
			if(n%2==0)
				System.out.println(n); 
		};
		
		listOfNums.forEach(activity7);

		System.out.println("---------");

		
		listOfNums.forEach(activity8);
		
		System.out.println("---------");

		listOfNums.forEach(activity9);

	}
}

class X
{
	void fun() { }
}

class Y extends X
{
	@Override 
	void fun() { }
}



@FunctionalInterface
interface MathActivity
{
	int expression(int x, int y);
	//int expr2(int i);
}
class Addition implements MathActivity
{
	public int expression(int x, int y) {
		return x+y;
	}
}

//for the sake of operation , we are writing an extra class
// with classname + implements interface + method body + code 

class Multiplication implements MathActivity
{
	public int expression(int x, int y) {
		return x*y;
	}
}