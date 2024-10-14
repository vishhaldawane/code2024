package jungle.farm;//House belongs to this folder

import jungle.cave.Tiger; //to avail it here
import jungle.cave.ButterFly;
//The type jungle.cave.ButterFly is not visible
public class House {
	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		tiger.jump();
//I. outside package, no sub class
		System.out.println(tiger.pri);
		System.out.println(tiger.def);
		System.out.println(tiger.pro);
		System.out.println(tiger.pub);
	}
}
//IV. outside package - sub class
class BengalTiger extends Tiger {
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
/*

	private
	protected
	public
	default
	

*/