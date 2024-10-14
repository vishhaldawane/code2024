
public class GenericTest {
	public static void swap(int a, int b)
	{
		System.out.println("Swapping...");
		System.out.println("before : a "+a+ " and b "+b);
		int temp =a ;
		a = b;
		b = temp;
		System.out.println("after: a "+a+ " and b "+b);

		System.out.println("Swapped...");
		
	}
	public static void main(String[] args) {

		int x=10;
		int y=20;
		System.out.println("main: x "+x);
		System.out.println("main: y "+y);
		swap(x,y);
		System.out.println("main: x "+x);
		System.out.println("main: y "+y);	
	}
	
}

