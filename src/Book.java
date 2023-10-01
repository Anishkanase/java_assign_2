
public class Book {
	String title;
	String author;
	int publication_year;

	public Book(String title, String author, int publication_year) {
	
		this.title = title;
		this.author = author;
		this.publication_year = publication_year;
	}

	public static void main(String[] args) {
		 
		Book b1= new Book("ikigai","hector gracia",2016);
		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.publication_year);
		
	}
}
