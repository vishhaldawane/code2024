
public class GenericTest2 {
	public static void main(String[] args) {
//MyValuesPair is a raw type. 
//References to generic type MyValuesPair<T> 
//should be parameterized		
		MyValuesPair  intPair = new MyValuesPair(10, 20);
		intPair.print();
		intPair.swap();
		intPair.print();
		
		System.out.println("-------------------");
		
		MyValuesPair<Float> floatPair = new MyValuesPair<Float>(10.4f, 20.5f);
		floatPair.print();
		floatPair.swap();
		floatPair.print();
		
		System.out.println("-------------------");
		
		MyValuesPair<String> strPair = new MyValuesPair<String>("Julia","Robert");
		strPair.print();
		strPair.swap();
		strPair.print();
		
		
	}
}

//Below class is Generic Class
class MyValuesPair<T> //T means Any Type
{
	private T x;
	private T y;
	
	 MyValuesPair(T x, T y) {
		this.x = x;
		this.y = y;
	}
	void swap() {
		T temp= x;
		x = y;
		y = temp;
	}
	void print() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		
	}
}
