import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		
		SimpleDateFormat dob = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Scanner scan = new Scanner(System.in);
			Date date = dob.parse(scan.next());
			System.out.println("dob : "+date);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
