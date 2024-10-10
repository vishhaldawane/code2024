/*
  
  	StringBuffer						StringBuilder
  		|									|
  	can't use multiple					can use multiple threads
  	thread to work with it				to work with it
  	|										|
  	only one thread is allowed		multiple threads can work
  	to work with it's method		with its method
  
  
 */
public class StringBufferTest {
	//cant use multiple thread to work with StringBuffer
	// mutable Strings
	public static void main(String[] args) {
	
		StringBuffer buff = new StringBuffer("CG");
		System.out.println("buff : "+buff);
		System.out.println("buff : "+buff.hashCode());
		
		System.out.println("updating buff....");
		buff.append("Private Ltd.");
		
		System.out.println("buff : "+buff);
		System.out.println("buff : "+buff.hashCode());
		
		System.out.println("----------");
		
		StringBuilder strBuild = new StringBuilder("CG");
		System.out.println("strBuild : "+strBuild);
		System.out.println("strBuild : "+strBuild.hashCode());
		
		System.out.println("updating buff....");
		strBuild.append("Private Ltd.");
		
		System.out.println("strBuild : "+strBuild);
		System.out.println("strBuild : "+strBuild.hashCode());
	}
	
}
