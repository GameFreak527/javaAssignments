package vehicle;

public class Driver {
	
	public static void main(String[] args) {
		
		Car ferrari = new Car(4,4,4);
		ferrari.setName("Ferrari");
		ferrari.setSpeed(350);
		
		ferrari.averageSpeed();
		ferrari.run();
		System.out.println(ferrari.toString());
		
		ferrari.play();
		
	}

}
