import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

public class MapWithDate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in)
				;
		try {
		PersonalInfo info = new PersonalInfo();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		info.addBirthday("julie", format.parse("2002-2-20"));
		info.addBirthday("jane", format.parse("2003-4-22"));
		info.addBirthday("jack", format.parse("2001-5-25"));
		info.addBirthday("janet", format.parse("2000-6-20"));
		info.addBirthday("julia", format.parse("2003-6-26"));
		
		System.out.println("Enter name : ");
		String name = scan.next();
		

		Date dob = info.search(name);
		System.out.println("janes dob : "+dob);
		}
		catch(Exception e) {
			System.out.println("Problem : "+e.getMessage());
		}
		
	}
}

class PersonalInfo
{
	HashMap<String,java.util.Date> friendsBirthdays = new HashMap<String,java.util.Date>();

	void addBirthday(String friendsName, java.util.Date date) {
		if( ! friendsBirthdays.containsKey(friendsName))
			friendsBirthdays.put(friendsName, date);
		else 
			System.out.println("This key is already added....");
	}
	
	Date search(String key) {
		Date dob = null;
		if(friendsBirthdays.containsKey(key)) {
			dob = friendsBirthdays.get(key);
			
		}
		else {
			throw new RuntimeException("Friend name not found ");
		}
		return dob;
	}
	
}

