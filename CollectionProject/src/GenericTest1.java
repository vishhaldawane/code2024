
public class GenericTest1 {
	public static void main(String[] args) {
		
		MyIntegersPair intPair = new MyIntegersPair(10, 20);
		intPair.print();
		intPair.swap();
		intPair.print();
		
		System.out.println("-------------------");
		
		MyFloatsPair floatPair = new MyFloatsPair(10.3f, 20.5f);
		floatPair.print();
		floatPair.swap();
		floatPair.print();
		
		System.out.println("-------------------");
		
		MyStringsPair strPair = new MyStringsPair("Julia","Robert");
		strPair.print();
		strPair.swap();
		strPair.print();
		
		
	}
}
class MyIntegersPair
{
	private int x;
	private int y;
	
	MyIntegersPair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		int temp= x;
		x = y;
		y = temp;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		
	}
}


class MyFloatsPair //99% code is same as of the MyIntegersPair
{
	private float x; //int replaced with float
	private float y;
	
	MyFloatsPair(float x, float y) { //int replaced with float
		this.x = x;
		this.y = y;
	}
	void swap() {
		float temp= x; // only int replaced with float
		x = y;
		y = temp;
	}
	void print() { //100% as it is 
		System.out.println("x "+x);
		System.out.println("y "+y);
		
	}
}

class MyStringsPair //99% code is same as of the MyIntegersPair
{
	private String x; //int replaced with String
	private String y;
	
	MyStringsPair(String x, String y) { //int replaced with String
		this.x = x;
		this.y = y;
	}
	void swap() {
		String temp= x; // only int replaced with String
		x = y;
		y = temp;
	}
	void print() { //100% as it is 
		System.out.println("x "+x);
		System.out.println("y "+y);
		
	}
}