

/*
 * formula of creating anything in this world
 * 
 * thoughts + feel = action + result
 *  |
 *  faster than light
 *  invisible
 *  non-linear
 *  
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		System.out.println("------");

		AudioBook audioBook = new AudioBook();
	}
}
class Book
{
	String title;
	String author;
	float price;
	int numberOfPages;
	
	Book() {
		System.out.println("Book ctor...");
	}
}

class PDF extends Book
{
	int sizeInMB; // 4 fields inhertied + sizeInMB here
	
	PDF() {
		System.out.println("PDF ctor...");
	}
}

class AudioBook extends Book
{
	int duration;// 4 fields inhertied  + duration  + narrator
	String narrator;
	
	AudioBook() {
		System.out.println("AudioBook ctor...");
	}
}
