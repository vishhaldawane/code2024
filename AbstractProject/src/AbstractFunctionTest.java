public class AbstractFunctionTest {
	public static void main(String[] args) {
		Circle circle = new Circle(57);
		circle.draw();
		circle.fillColor();
		circle.calcArea();
		
		circle = new Ellipse(60,70);
		circle.draw();
		circle.fillColor();
		circle.calcArea();
		
	}
}
abstract class GeometricalShape // Generalization
{
	float area; //FIELD of the abstract class
	float perimeter;
	
	abstract void calcArea(); // will it be a mandate on its child?
	abstract void calcPeriPhery(); //perimeter
	abstract void draw(); // <-- abstract function must be declared
						//in an abstract class
	
	//abstract class may have non-abstract methods
	void fillColor() //inherited to the children
	{
		System.out.println("Filling color to the image...");
	}
}
//The type Circle "must" implement the 
//inherited abstract method GeometricalShape.draw()

//The type Circle must implement the 
//inherited abstract method GeometricalShape.calcArea()

class Circle extends GeometricalShape { //SPECIALIZATION
	int radius1;
	final static float PI=3.14f;
	
	Circle(int rad){
		radius1 = rad;
	}
	//Circle() { }
	void draw()
	{
		System.out.println("Drawing a circle...of radius "+radius1);
	}
	void calcArea() //DEFINED THE FUNCTION- mandatory - compulsory
	{
		area = PI * radius1 * radius1;
		System.out.println("Area of the circle : "+area);
	}
	void calcPeriPhery() //DEFINED THE FUNCTION- mandatory - compulsory
	{
		perimeter = 2*PI *radius1;
		System.out.println("perimeter of the circle : "+perimeter);
	}
}
class Ellipse extends Circle
{
	int radius2;
	
	Ellipse(int rad1, int rad2){
		super(rad1); //invoke the super class ctor.
		radius2  = rad2;
	}
	//overriding done here - which WAS NOT mandatory
	//it is a choice for this class whether to override or not
	void draw()
	{
		System.out.println("Drawing an Ellipse...of radius "+radius1+ " and radius2 "+radius2);
	}
	
}











//an abstract class may not have abstract methods

abstract class Ghost
{
	// there is no abstract function here
}
