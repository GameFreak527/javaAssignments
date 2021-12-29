package oopsConcept;

public abstract class OnlineServices {
	private static int points;
	
	public OnlineServices(int points) {
		OnlineServices.points = points;
	}
	
	private int getPoints() {
		return points;
	}
	
	private int setPoints(int points) {
		return this.points = points;
	}
	
	public int avilablePoints() {
		return this.getPoints();
	}
	
	public int addPoints(int points) {
		 return this.setPoints(this.getPoints() + points);
	}
	
	public int redeemePoints(int points) {
		return this.setPoints(getPoints() - points);
	}
}

	
