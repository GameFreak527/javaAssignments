package library;


public class Driver {
	
	public static void main(String args[]) {
		
		//Adding Book
		Book b1 = new Book(1,"War Games",1990,null);
		Book b2 = new Book(2,"Tital War",2000,null);
		
		//Adding Author
		Author a1 = new Author(1,"Shiv Rana",25);
		Author a2 = new Author(2,"Rajinder Sing", 47);
		
		//Adding users
		User u1 = new User(1,"Neelam Devi");
		User u2 = new User(2, "Prem Chand");
		
		//Adding books to user
		System.out.println(u1.addBook(b1));
		
		//Adding author to the book
		
		System.out.println(a1.addBook(b1));
		
		
	}

}
