public class FinalFieldTest {
	public static void main(String[] args) {

		//final float PI=3.14f; //    22/7
		
		//System.out.println("PI : "+PI);//
//The final local variable PI cannot be assigned. 
		//It must be blank and not using a compound assignment
		//PI=3.18f;
		
		
		//System.out.println("PI : "+PI);
		
		Circle circle1  = new Circle(45);
		circle1.calculateArea();
		
		Circle circle2  = new Circle(95);
		circle2.calculateArea();
		
		Circle circle3  = new Circle(125);
		circle3.calculateArea();
		
		
	}
}

class Circle
{
	float radius;
	static final float PI=3.14f; // FIELD that cannot be changed
	
	Circle(float r) {
		radius = r;
	}
	void calculateArea() {
		float area = PI * radius * radius;
		System.out.println("AREA : "+area);
	}
}
