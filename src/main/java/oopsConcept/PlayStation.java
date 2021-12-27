package oopsConcept;

public class PlayStation extends Console{
	private int exclusive;
		
	public PlayStation(int exclusive) {
		this.exclusive = exclusive;
	}

	//Overriding
	public int games() {
		return super.games() + this.exclusive;
	}
}
