package animal;

public abstract class Mammals implements Animal{
	
	private int legs;
	private int tail;
	
	public Mammals(int legs, int tail) {
		this.legs = legs;
		this.tail = tail;
	}
	
	
	public void dip() {
		System.out.println("This animal can dip inside the water");
	}

	@Override
	public void walk() {
		System.out.println("This animal can Walk");
	}
	
	@Override
	public void eat() {
		System.out.println("This animal can eat");
	}
	
	public void swim() {
		System.out.println("This animal can swim");
	}


	@Override
	public String toString() {
		return "Mammals [legs=" + legs + ", tail=" + tail + "]";
	}
	
	
}
