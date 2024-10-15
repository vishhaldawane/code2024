import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Country c1 = new Country("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
		Country c2 = new Country("Pakistan", "Islamabad", "Mr. Imran Khan", "21.66 Crores", "Pakistani Rupee");
		Country c3 = new Country("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
		Country c4 = new Country("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
		Country c5 = new Country("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
		System.out.println("Content is ready : all 5 countries ");
		//Map = key and value
		
		TreeMap<String,Country> countryMap = new TreeMap<String,Country>();
		System.out.println("Container is ready with String key and Country value....");
		
		System.out.println("Adding country in the map....");
		countryMap.put("ind", c1);
		countryMap.put("pak", c2);
		countryMap.put("chi", c3);
		countryMap.put("uk",  c4);
		countryMap.put("usa", c5);
		System.out.println("Added all the countries");
		
		
		//only keys are retrieved
		
		Set<String> keys = countryMap.keySet();
		System.out.println("Retrieved the keys.....all strings...");
		
		System.out.println("Stepping thru all the keys.....");
		Iterator<String> keyIter  = keys.iterator();
		while(keyIter.hasNext()) {
			
			String theKey = keyIter.next(); //key found
			
			
			Country theCountry = countryMap.get(theKey);
			System.out.println("Got the Country...");
			
			System.out.println("Country : "+theCountry);
		}
		
			System.out.println("=======================");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter country key : ");
			String keyToSearch = scan.next();
			
			if(countryMap.containsKey(keyToSearch))
			{
				System.out.println("KEY found : "+keyToSearch);
				Country country = countryMap.get(keyToSearch);
				System.out.println("Country : "+country);
			}
			else {
				System.out.println("KEY NOT found : "+keyToSearch);

			}
		
		
	}
}
//Map = Key and Value  pair

class Country
{
	String name;
	String capital;
	String primeMinister;
	String population;
	String currency;
	
	public Country(String name, String capital, String primeMinister, String population, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", primeMinister=" + primeMinister + ", population="
				+ population + ", currency=" + currency + "]";
	}
	
	
}