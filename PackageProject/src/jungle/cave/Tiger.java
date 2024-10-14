package jungle.cave; // <-- must be the first line


public class Tiger {

	
	private   int pri;
              int def;
	protected int pro;
	public    int pub;
	
	public void jump() {
		System.out.println("Tiger is jumping...");
		System.out.println(pri);
		System.out.println(def);
		System.out.println(pro);
		System.out.println(pub);
	}
}
//II. same package, no sub class
class ButterFly{
	void fly() {		
		Tiger tiger = new Tiger();
		tiger.jump();	 //its not public 
		System.out.println(tiger.pri);
		System.out.println(tiger.def);
		System.out.println(tiger.pro);
		System.out.println(tiger.pub);
	}
}
//III. same package - sub class
class WhiteTiger extends Tiger{
	public void jump(Tiger t){
		System.out.println(pri);
		System.out.println(def);
		System.out.println(pro);
		System.out.println(pub);
		System.out.println(t.pri);
		System.out.println(t.def);
		System.out.println(t.pro);
		System.out.println(t.pub);
		
	
	}
}