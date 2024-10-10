/*
  
  	StringBuffer						StringBuilder
  		|									|
  	can't use multiple					can use multiple threads
  	thread to work with it				to work with it
  	|										|
  	only one thread is allowed		multiple threads can work
  	to work with it's method		with its method
  	|										|
  	two threads can't call 			two threads can call
  	methods of StringBuffer			methods of StringBuilder
  	|									|
  	synchronized					not-synchronized
  	|									|
  	like : Tube Well				like : Open Well
  	|									|
  	less efficient					efficient
  	
  	StringBuffer buff;				StringBuilder build;
  	|												|	thread3
  	buff <-- thread1, thread2, thread3					|
 														|
  											thread1 ->build <--thread2
 
 	StringBuilder
 				| at a time all 3 can shop
 				|
 Brother -- ShoppingCart<-- You<-addItem1,
  |			|			addItem3
addItem7 	Sister		addItem5
 			|
 			addItem2
 			addItem4
 			addItem6
 			
 			
 			But at the Billing Counter1 <-- StringBuffer
 									|
 								ShoppingCart1
 								ShoppingCart2
 								ShoppingCard3
 						
 			
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
