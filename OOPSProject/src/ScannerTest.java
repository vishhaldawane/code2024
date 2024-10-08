import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter empno : ");
		int eno = scan1.nextInt();
		
		System.out.println("emp no : "+eno);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter emp name : ");
		String  ename = scan2.next();
		
		System.out.println("emp name : "+ename);
		
		
		
	}
}
