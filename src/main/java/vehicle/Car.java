package vehicle;

public class Car extends Vehicle implements GearSystem,MusicSystem{
	
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
	
	@Override
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

	@Override
	public void engineType(int type) {
		if(type <= 0 || type > 2) {
			System.out.println("Please choose between 1 and 2");
			return;
		}
		if(type == 1) {
			System.out.println("You have choosen the Manual engine system");
		}
		if(type == 2) {
			System.out.println("You have choosen the Automatic engine system");
		}
		
	}

}
