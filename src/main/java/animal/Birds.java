package animal;

public abstract class Birds implements Animal{

	private int legs;
	private int wings;
	
	public Birds(int legs, int wings) {
		this.legs = legs;
		this.wings = wings;
	}
	public int getLegs() {
		return legs;
	}
	public int getWings() {
		return wings;
	}
	public void flap() {
		System.out.println("This animal can flap the wings");
	}
	
	public void fly() {
		System.out.println("This animal can fly");
	}
	
	@Override
	public void eat() {
		System.out.println("This animal can eat");
	}
	
	@Override
	public void walk() {
		System.out.println("This animal can walk");
	}
	@Override
	public String toString() {
		return "Birds [legs=" + legs + ", wings=" + wings + "]";
	}
}
