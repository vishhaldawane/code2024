
public class ArrayAndStringException {

	public static void main(String[] args) {

		int score[]= {10,20,30,40,50};
		
		try {
			System.out.println("score 0 : "+score[0]);
			System.out.println("score 1 : "+score[1]);
			System.out.println("score 2 : "+score[20]);//<---
			System.out.println("score 3 : "+score[3]);
			System.out.println("score 4 : "+score[4]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid index for the array....");
		}
		
		//new activity atall
		try
		{
			String str="Cap";
			System.out.println("alphebet : "+str.charAt(0));
			System.out.println("alphebet : "+str.charAt(1));
			System.out.println("alphebet : "+str.charAt(2));
			
			System.out.println("alphebet : "+str.charAt(12));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Problem 2 : "+ex);
		}
	}

}
