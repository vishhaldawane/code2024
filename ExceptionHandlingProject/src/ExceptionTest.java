
public class ExceptionTest {

	public static void main(String[] args) {

		System.out.println("Begin main"); //1
		
		int x = 10; //2
		int y = 8; //3
		System.out.println("x "+x); //4
		System.out.println("y "+y); //5
		
		if(y != 0 ) //if the denominator is not ZERO
		{
			System.out.println("Trying to divide "+x+" by "+y); //6
		
			int z = x / y; //when y is 0, 
						//1. JVM throws an Exception
						//known as ArithmeticException towards	
						//your program,
		
			//2. Therefore you will have to CATCH that THROWN exception
			//3. if YOU WONT catch, then it is re-thrown to JVM
			//4. and JVM would drop that Exception by terminating your application
			System.out.println("division : "+z); //8 

		}
		else {
			System.out.println("-- Cannot Divide BY ZERO -- ");
		}
		
		

		System.out.println("----------");
		
		
		int a = 10; //2
		int b = 3; //3
		System.out.println("a "+a); //4
		System.out.println("b "+b); //5
		System.out.println("Trying to divide "+a+" by "+b); //6
		int c = a / b; //cannot divide by zero 7
		System.out.println("division : "+c); //8 

		System.out.println("----------");
		
		int p = 10; //2
		int q = 7; //3
		System.out.println("p "+p); //4
		System.out.println("q "+q); //5
		System.out.println("Trying to divide "+p+" by "+q); //6
		int r = p / q; //cannot divide by zero 7
		System.out.println("division : "+r); //8 

		
		
		System.out.println("End main"); //9
		
		
	}

}
