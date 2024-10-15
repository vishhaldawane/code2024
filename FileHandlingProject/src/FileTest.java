import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Trying to open a file...");
			FileInputStream fin = new FileInputStream("/Users/apple/CG2024/Day1.txt");
			System.out.println("File is open...\n");
			
			byte letter=0;
			letter = (byte) fin.read(); //read the first letter, ie H of Hello
			
			while(letter!=-1) { // -1 to check the EOF
				System.out.print((char)letter);
				letter = (byte) fin.read(); //continue reading from 2nd letter onwards
			}
			System.out.println("\nTrying to close the file...");
			fin.close();
			System.out.println("\nFile is closed...");
		} catch (FileNotFoundException e) {
			System.out.println("problem1 : "+e);
		} catch (IOException e) {
			System.out.println("problem2 : "+e);

		}
	
		
	}
}
