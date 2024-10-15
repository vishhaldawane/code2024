import java.util.Scanner;
import java.util.TreeMap;

public class CountryTest {
	public static void main(String[] args) {
		
		TreeMap<String,String> countryDetails = new TreeMap<String,String>();
		
		countryDetails.put("India", "New Delhi");
		countryDetails.put("Pakistan", "Islamabad");
		countryDetails.put("China", "Beizing");
		countryDetails.put("England", "London");
		countryDetails.put("America", "New York");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter country : "); //key
		String countryKey = scan.next();
		
		String capital = "";
		if(countryDetails.containsKey(countryKey)) {
			capital = countryDetails.get(countryKey);
			System.out.println("Capital of "+countryKey+ " is "+capital);;
		}
		else {
			System.out.println("Key not found : "+countryKey);
		}
		
		
	}
}
