
public class GenericTest1 {
	public static void main(String[] args) {
		MyIntegersPair intPair = new MyIntegersPair(10, 20);
		intPair.print();
		intPair.swap();
		intPair.print();
		
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
