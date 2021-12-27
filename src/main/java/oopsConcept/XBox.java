package oopsConcept;

public class XBox extends OnlineServices implements Playable{
	private int players;
	
	public XBox() {
		super(0);
	}
	
	public void setPlayers(int player) {
		this.players = player;
	}
	
	private int getPlayers() {
		return this.players;
	}
	
	public Boolean singlePlayer() {
		return (this.getPlayers() ==1);
		
	}
	
	public Boolean mutiPlayer() {
		return (this.getPlayers() > 1);
	}
	
	public void buyGame(int game) {
		System.out.println(String.format("You bought : %d Games and Earned %d points",game, super.addPoints(game*10)));
	}
	
	public void buyGameUsingPoints() {
		if(super.avilablePoints() != 0) {
			System.out.println("You bought 1 game and your available points are "+ super.redeemePoints(10));
		}
		else {
			System.out.println("Your points are not enough to buy a game");
			System.out.println("Your points are : "+super.avilablePoints());
		}
	}

}
