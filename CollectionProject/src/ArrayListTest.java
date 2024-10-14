import java.util.*;
class Log
{
	String name; //sachin, seema
	String number; //283928392
	String type; //dialed, missed, recieved
	public Log(String name, String number, String type) {
		super();
		this.name = name;
		this.number = number;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Log [name=" + name + ", number=" + number + ", type=" + type + "]";
	}
	
	
}
public class ArrayListTest {
	public static void main(String[] args) {
//ArrayList is a raw type. 
//References to generic type ArrayList<E> should be parameterized	
		
		//container - GLASS
		ArrayList<Log> numbersList = new ArrayList<Log>();
//		LinkedList<Integer> numbersList = new LinkedList<Integer>();
//		TreeSet<Integer> numbersList = new TreeSet<Integer>();
//		HashSet<Integer> numbersList = new HashSet<Integer>();

		System.out.println("Container created....Glass");
		
		Log log1 = new Log("Kavita","9877665544","Recieved");
		Log log2 = new Log("Rashmi","8877665544","Dialled");
		Log log3 = new Log("Vishhal","9820443464","Missed");
		
		numbersList.add(log1); //<--content - ButterMilk
		numbersList.add(log2);
		numbersList.add(log3);
		
			
		System.out.println("Contents are added to the container.. ButterMilk");
		
		//Iterator = Straw
		Iterator<Log> numIter = numbersList.iterator();
		System.out.println("Retrieved the Iterator....Straw");
		
		while(numIter.hasNext()) { //access the status of the container
									//via iterator - it it has values 
			Log x = numIter.next();
			System.out.println("value :  "+x);
		}
			
		
	}
}
