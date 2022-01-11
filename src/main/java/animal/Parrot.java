package animal;

public class Parrot extends Birds{

	private String color ;
	
	public Parrot(int legs, int wings, String color) {
		super(legs, wings);
		this.color = color;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Parrot [color=" + color + "]" + super.toString();
	}

	
	public boolean equals(Parrot obj) {
		// TODO Auto-generated method stub
		return (this.getColor() == obj.getColor() && super.getLegs() == obj.getLegs() && super.getWings() == obj.getWings());
	}
	

}
