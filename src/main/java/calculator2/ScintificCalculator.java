package calculator2;

public class ScintificCalculator extends Calculator{
	
	//Encapsulation
	private int a,b;
	
	public void setA(int a) {
		this.a = a;
	}
	public  void setB(int b) {
		this.b = b;	
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	//Method Overriding
	@Override
	public int div(int a, int b) {
		return a/b;
		}
	
	//Method Overloading
	public int add(int a, int b, int c) {
		return a + b+ c;
	}

}
