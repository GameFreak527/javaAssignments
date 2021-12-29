package vehicle;

public class Car extends Vehicle implements MusicSystem{
	
	public Car(int door, int window, int wheel) {
		super(door, window, wheel);
	}

	private String name;
	private int speed;
	
	private int getSpeed() {
		return this.speed;
	}
	
	private String getName() {
		return this.name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return super.toString() + "\n" +
				String.format("Car name : %s, and its Top speed is : %d", this.getName(),this.getSpeed());
	}
	
	@Override
	public void averageSpeed() {
		System.out.println("This car has an average speed of : " +this.getSpeed()/2);
	}

	@Override
	public void play() {
		System.out.println("This car can play music");
		
	}

}
