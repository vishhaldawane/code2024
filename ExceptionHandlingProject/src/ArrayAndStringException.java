
public class ArrayAndStringException {

	public static void main(String[] args) {

		System.out.println("begin main....");
		int score[]= null;// {10,20,30,40,50};
		
		//LOGIC1
		try {
			System.out.println("printing first value ...");
			System.out.println("score 0 : "+score[0]);
			System.out.println("score 1 : "+score[1]);
			System.out.println("score 2 : "+score[20]);//<---
			System.out.println("score 3 : "+score[3]);
			System.out.println("score 4 : "+score[4]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("1 Invalid index for the array....");
		}
		catch(NullPointerException ex) {
			System.out.println("2 Problem  : "+ex);
		}
		
		
		//LOGIC2
		//new activity atall
		try
		{
			String str=null;
			System.out.println("alphebet : "+str.charAt(0));
			System.out.println("alphebet : "+str.charAt(1));
			System.out.println("alphebet : "+str.charAt(2));
			
			System.out.println("alphebet : "+str.charAt(12));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("3 Problem  : "+ex);
		}
		catch(NullPointerException ex) {
			System.out.println("4 Problem : "+ex);
		}
		
		System.out.println("END OF MAIN");
	}

}
