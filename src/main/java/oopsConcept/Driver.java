package oopsConcept;

public class Driver {
	public static void main(String[] args) {
		PlayStation ps = new PlayStation(10);
		ps.setSpace(4);
		ps.setPrice(100);
		ps.setPlayers(6);
		System.out.println("Total number of games available : "+ ps.games());
		System.out.println(ps);
		
		Nintendo ns = new Nintendo(4);
		ns.setPlayers(4);
		ns.setPrice(20);
		ns.setSpace(2);
		System.out.println("Number of max sales Nintendo do : "+ ns.maxSales());
		System.out.println(ns);
		
		XBox xb = new XBox();
		xb.setPlayers(2);
		System.out.println("Is XBox is Single player? : "+xb.singlePlayer());
		System.out.println("Is XBox is Multi player? : "+xb.mutiPlayer());
		
		//buying a game
		xb.buyGame(2);
		System.out.println("Available points are : "+xb.avilablePoints());
		
		xb.buyGameUsingPoints();
		xb.buyGameUsingPoints();
		xb.buyGameUsingPoints();
		
		
	}
	
	public void buyPlayStation() {
		
	}
	
	public void buyNintendo() {
		
	}
	
	public void buyXBox() {
		
	}
	
	

}
