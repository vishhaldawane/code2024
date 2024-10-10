/*
 
 			String Pool
 			
 									<--read only value - constant
 							"JULIE" <-- immutable - non-changeble
 		   +---------------->70948157 <-- memory address
 		   |				 |	
 		   |				 |    str3 --------> ROBERT
 		70948157			 |		
 		str1				70948157
 							str2
 							
 */
public class StringBuilderStringBufferTest {
	public static void main(String[] args) {
		
		String str1 = "JULIE";
		
		System.out.println("str1  : "+str1);
		System.out.println("str1  : "+str1.hashCode());
		
		String str2 = "JULIE";
		
		System.out.println("str2  : "+str2);
		System.out.println("str2  : "+str2.hashCode());
		
		String str3 = new String("JULIE");
		
		System.out.println("str3  : "+str3);
		System.out.println("str3  : "+str3.hashCode());
		
		System.out.println("setting ROBERT to str3......");
		str3 = "ROBERT";
		System.out.println("now : str3  : "+str3);
		System.out.println("now : str3  : "+str3.hashCode());
		
		
		
		System.out.println("str1  : "+str1);
		System.out.println("str1  : "+str1.hashCode());
		
		System.out.println("str2  : "+str2);
		System.out.println("str2  : "+str2.hashCode());
		
	}
}
