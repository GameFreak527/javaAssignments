package vehicle;

public interface GearSystem extends EngineSystem{

	default void gear(int gear) {
		if (gear <= 0 || gear > 4) {
			System.out.println("Car is in neutral");
		} else {
			System.out.println("Car is in " + gear + " Gear");
		}
	}

}
