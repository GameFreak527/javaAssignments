package library;

import java.util.ArrayList;

public class Author {
	private int id;
	private String name;
	private int age;
	private static ArrayList<Book> booksList;
	
	
		
	public Author(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		booksList = new ArrayList<Book>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(ArrayList<Book> booksList) {
		this.booksList = booksList;
	}
	
	public Author addBook(Book book) {
		this.getBooksList().add(book);
		return this;
	}
	
	public Book findBookById(int id) {
		Book book = null ;
		for(Book b: getBooksList()) {
			if(b.getId() == id) {
				book = b;
			}
		}
		return book;
	}
	
	public Author removeBook(Book book) {
		this.getBooksList().remove(book);
		return this;
	}
	
	public Author removeBookById(int id) {
		return this.removeBook(this.findBookById(id));
	}
	
	public String displayBooks() {
		String books="";
		try {
			for(Book b : getBooksList()) {
				books = books + "\n "+ b.toString();
			}
		}
		catch(NullPointerException e) {
			System.out.println("Author has 0 books");
		}
		
		return books;
	}
	
	public String toString() {
		return String.format("Id: %d, Name: %s, Age: %d, Books: ", this.getId(), this.getName(), this.getAge()) + this.displayBooks();
	}
	
}
