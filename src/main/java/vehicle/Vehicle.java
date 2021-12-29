package vehicle;

public abstract class Vehicle {
	private int door;
	private int window;
	private int wheel;
	
	public Vehicle(int door, int window,int wheel) {
		this.door = door;
		this.window = window;
		this.wheel = wheel;
	}
	
	private int getDoor() {
		return door;
	}

	private int getWindow() {
		return window;
	}

	private int getWheel() {
		return wheel;
	}

	public void run() {
		System.out.println("This car is built to run");
	}
	
	public abstract void averageSpeed(); 
	
	@Override
	public String toString() {
		return String.format("This Vehicle has : %d Doors, %d Windows and %d Wheels", this.getDoor(), this.getWindow(), this.getWheel());
	}

}
