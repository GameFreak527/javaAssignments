package library;

import java.util.ArrayList;

public class User {
	private int id;
	private String name;
	private static ArrayList<Book> books;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		books = new ArrayList<Book>();
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
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public User addBook(Book book) {
		this.getBooks().add(book);
		return this;
	}
	
	public Book getBookById(int id) {
		Book book = null ;
		for(Book b: getBooks()) {
			if(b.getId() == id) {
				book = b;
			}
		}
		return book;
	}
	
	public String displayBooks() {
		String books=" ";
		for(Book b : this.getBooks()) {
			books = books + "\n "+ b.toString();
		}
		return books;
	}
	
	public String toString() {
		return String.format("User Id: %s, Name: %s & Books Borrowed: %s", this.getId(), this.getName(),this.displayBooks() );
	}
	
	
}
