import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		/*
		Vegetable veg1 = new Vegetable("Tomato","red",120);
		Vegetable veg2 = new Vegetable("Potato","brown",50);
		Vegetable veg3 = new Vegetable("Onion","white",75);
		Vegetable veg4 = new Vegetable("Carrot","orange",50);
		Vegetable veg5 = new Vegetable("Spinach","green",35);
		
		VegetableSeller seller = new VegetableSeller();
		seller.addItem("tomato5kg", veg1);
		seller.addItem("potato5kg", veg2);
		seller.addItem("onion50kg", veg3);
		seller.addItem("carrot10kg", veg4);
		seller.addItem("spinach3kg", veg5);
		
		Vegetable vegFound = seller.search("caot10kg");
		System.out.println("Veg found  : "+vegFound);
		*/
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		VegetableSeller seller = new VegetableSeller();
		
//Tomato:Red:120
		
		do
		{
			System.out.println(" VEGETABLE SELLER ");
			System.out.println("-------------------");
			System.out.println("1. Add vegetable..");
			System.out.println("2. Search vegetable..");
			System.out.println("3. Exit.");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			
				switch(choice) {
					case 1: 
						System.out.println("Enter vegetable info : ");
						String data = scan.next();
						String splitedData[] = data.split(":");
						String name = splitedData[0];
						String color = splitedData[1];
						float price = Float.parseFloat(splitedData[2]);
						
						Vegetable veg = new Vegetable(name,color,price);
						
						seller.addItem(name, veg);
						
						break;
					case 2: System.out.println("Enter vegetable key : ");
						String key = scan.next();
						Vegetable vegFound = seller.search(key);
						System.out.println("Veg found : "+vegFound);
						break;
					case 3:
						System.out.println("Thank you");
						break;
					default:
						System.out.println("Mismatched case..");
				}
		} while(choice != 3);
		System.out.println("End of main");
	}
}

class VegetableSeller
{
	HashMap<String,Vegetable>  vegBoard = new HashMap<String,Vegetable>();
	
	void addItem(String key, Vegetable veg) {
		if(!vegBoard.containsKey(key)) {
			vegBoard.put(key, veg);
			System.out.println("Vegetable added");
		}
		else {
			System.out.println("This key already exists : "+key);
		}

	}
	
	Vegetable search(String key) {
		Vegetable vegRef = null;
		
		if(vegBoard.containsKey(key)) {
			vegRef = vegBoard.get(key);
		}
		else {
			throw new RuntimeException("Veg key not found");
		}
		return vegRef;
	}

	public HashMap<String, Vegetable> getVegBoard() {
		return vegBoard;
	}

	public void setVegBoard(HashMap<String, Vegetable> vegBoard) {
		this.vegBoard = vegBoard;
	}
	
	
	
}

class Vegetable
{
	String name;
	String color;
	float price;
	

	public Vegetable(String name, String color, float price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
}

//Map - interface not connected to Collections

/*
 * 			Iterable
 * 				|
 * 			Collection
 * 				|
 * 			------------
 * 			|			|
 * 			List		Set
 * 			|			|
 * 			LL AL		TS HS
 * 
 * 
 * 		Map --> KEY AND VALUE
 * 		|			at reception/or at ground floor
 * 		|		u see a NAME board 
 * 	----------
 * |		|
 * TreeSet	HashMap <---
 * sorted	random
 * 
 * 
 */
