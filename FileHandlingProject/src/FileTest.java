import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		
		int wordCount=0;
		int lineCount=0;
		int letterCount=0;
		
		try {
			System.out.println("Trying to open a file...");
			FileInputStream fin = new FileInputStream("prince.txt");
			System.out.println("File is open...\n");
			
			byte letter=0;
			letter = (byte) fin.read(); //read the first letter, ie H of Hello
			
			while(letter!=-1) { // -1 to check the EOF
				++letterCount;
				
				char ch=(char)letter;
				if(ch=='\n') {
					++lineCount;
					
					System.out.println("\n-------------");
				}
				
				if(ch==' ' ||ch=='\n') {
					++wordCount;
				}
				System.out.print((char)letter);
			
				letter = (byte) fin.read(); //continue reading from 2nd letter onwards
			}
			System.out.println("Lines "+lineCount);
			System.out.println("Words "+wordCount);
			System.out.println("Chars "+letterCount);

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
