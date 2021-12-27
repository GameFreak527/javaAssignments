package oopsConcept;

public class Console {
	private int players;
	private int space;
	private int price;
	
	private int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	private int getSpace() {
		return space;
	}
	public void setSpace(int space) {
		this.space = space;
	}
	private int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
	public int games() {
		return space * price;
	}
	
	//Override method
	public String toString() {
		return String.format("Console name : %s, Price : $%d, Space : %dTB, Players : %d", this.getClass().getSimpleName(),this.getPrice(), this.getSpace(), this.getPlayers());
	}
}
