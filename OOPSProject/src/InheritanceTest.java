

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
		
		Book book = new Book("Java Programming","James G",1200,2000);
		System.out.println("book "+book);
		
		System.out.println("------");
		AudioBook audioBook = new AudioBook("Synchrodestiny","Dr. Deepak Chopra",950,1500,4,"Dr. Chopra");
		System.out.println("audio book "+audioBook);
	}
}
class Book // extends Object 
{
	String title;
	String author;
	float price;
	int numberOfPages;
	
	public Book(String title, String author, float price, int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", numberOfPages=" + numberOfPages
				+ "]";
	}
	
	
	
}

//Implicit super constructor Book() is undefined for default constructor.
//Must define an explicit constructor
class AudioBook extends Book
{
	int duration;// 4 fields inhertied  + duration  + narrator
	String narrator;
	
	public AudioBook(String title, String author, float price, int numberOfPages, int duration, String narrator) {
		super(title, author, price, numberOfPages);
		this.duration = duration;
		this.narrator = narrator;
	}

	@Override
	public String toString() {
		return "AudioBook [toString()=" + super.toString() + ", narrator=" + narrator + ", duration=" + duration + "]";
	}

	
}

/*
class Person
{
	char gender;
	int age;
	String name;
}
class Student extends Person
{
	char grade;
	String stream;
}
class Employee extends Student
{
	int empno;
	String desg;
	float salary;
}*/





/*
class PDF extends Book
{
	int sizeInMB; // 4 fields inhertied + sizeInMB here
	
	PDF() {
		System.out.println("PDF ctor...");
	}
}*/
