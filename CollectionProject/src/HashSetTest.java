import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		Book book1 = new Book(101,"Java","James",1200,1500.0f);
		Book book2 = new Book(102,"Oracle","Brian",1300,1300.0f);
		Book book3 = new Book(103,"Unix","Richard",1250,1800.0f);
		Book book4 = new Book(104,"Spring","David",1100,1200.0f);
		Book book5 = new Book(105,"JPA","Sam",1050,900.0f);
		
		BookShelf shelf = new BookShelf();
		shelf.addBookToTheShelf(book1);
		shelf.addBookToTheShelf(book2);
		shelf.addBookToTheShelf(book3);
		shelf.addBookToTheShelf(book4);
		shelf.addBookToTheShelf(book5);
		
		shelf.showAllBooks();
	}
}
class BookShelf
{
	HashSet<Book> allBooks = new HashSet<Book>();
	
	void addBookToTheShelf(Book newBook) {
		allBooks.add(newBook);
	}
	void showAllBooks() {
		Iterator<Book> bookIter = allBooks.iterator();
		while(bookIter.hasNext()) {
			Book theBook = bookIter.next();
			System.out.println("Book : "+theBook);
		}
	}
}
class Book
{
	int bookId;
	String bookTitle;
	String bookAuthor;
	int numberOfPages;
	float bookCost;
	
	public Book(int bookId, String bookTitle, String bookAuthor, int numberOfPages, float bookCost) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.numberOfPages = numberOfPages;
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", numberOfPages="
				+ numberOfPages + ", bookCost=" + bookCost + "]";
	}
	
	
	
}
