package library;

public class Book {
	
	private int id;
	private String name;
	private int releaseYear;
	private Author author;
	
	public Book(int id, String name, int releaseYear, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.releaseYear = releaseYear;
		this.author = author;
	}
	public Author getAuthor() {
		return author;
	}
	public Book setAuthor(Author author) {
		this.author = author;
		return this;
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
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public String toString() {
		return String.format("Book Id: %d, Name: %s, Release Year: %d, Author: %s", getId(),getName(), getReleaseYear(),getAuthor());
	}
	

}
