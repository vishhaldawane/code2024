package jungle.cave; // <-- must be the first line


public class Tiger {

	void jump() {
		System.out.println("Tiger is jumping...");
	}
}

class ButterFly
{
	void fly() {
		//no import requried, since both classes are in the same package
		
		Tiger tiger = new Tiger();
		tiger.jump();	 //its not public 
	}
}