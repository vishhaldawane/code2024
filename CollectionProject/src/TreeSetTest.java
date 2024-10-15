import java.util.Scanner;

public class TreeSetTest {
	public static void main(String[] args) {
		NumAvg numAvg = new NumAvg();
		int choice=0;
		Scanner numScanner = new Scanner(System.in);
		Scanner choiceScanner = new Scanner(System.in);
		
		do
		{
			System.out.println("1. Add number");
			System.out.println("2. Find Average");
			System.out.println("3. Exit");
			System.out.println("Enter your choice : ");
			choice = choiceScanner.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the number");
					int numberToAdd = numScanner.nextInt();
					numAvg.addNum(numberToAdd);
					break;
				case 2:
					System.out.println("Avg : "+numAvg.calAvg());				
					break;
				case 3:
					System.out.println("Thank you for using the application");
					break;
			}
		} while(choice !=3);
			
		System.out.println("End of main");
		
	}
}

