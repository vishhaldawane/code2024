import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
//ArrayList is a raw type. 
//References to generic type ArrayList<E> should be parameterized	
		
		//container - GLASS
//		ArrayList<Integer> numbersList = new ArrayList<Integer>();
//		LinkedList<Integer> numbersList = new LinkedList<Integer>();
//		TreeSet<Integer> numbersList = new TreeSet<Integer>();
		HashSet<Integer> numbersList = new HashSet<Integer>();

		System.out.println("Container created....Glass");
		
		numbersList.add(10); //<--content - ButterMilk
		numbersList.add(50);
		numbersList.add(30);
		numbersList.add(30);
		numbersList.add(60);
		
		numbersList.add(40);
		numbersList.add(60);
		numbersList.add(70);
		System.out.println("Contents are added to the container.. ButterMilk");
		
		//Iterator = Straw
		Iterator<Integer> numIter = numbersList.iterator();
		System.out.println("Retrieved the Iterator....Straw");
		
		while(numIter.hasNext()) { //access the status of the container
									//via iterator - it it has values 
			int x = numIter.next();
			System.out.println("value :  "+x);
		}
			
		
	}
}
