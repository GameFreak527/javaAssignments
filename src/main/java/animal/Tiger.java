package animal;

public class Tiger extends Mammals{
	private String color;

	public Tiger(int legs, int tail, String color) {
		super(legs, tail);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tiger [color=" + color + "]" + super.toString();
	}


}
