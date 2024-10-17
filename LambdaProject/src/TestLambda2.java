
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