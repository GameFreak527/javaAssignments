package vehicle;

public interface MusicSystem {
		
	public abstract void play();
	
	public static void canReplace() {
		System.out.println("This music system is replacable");
	}
	
}
