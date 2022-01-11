package wrapper;

public class Driver {
	public static void main(String[] args) {
		int num = 10;
		String string = "This is my program";
		
		//Wrapper class of Integer
		Driver.interger(num);
		
		//Wrapper class of String
		Driver.string(string);
	}
	
	public static void interger(int num) {
		//Wrapping int to Integer class
		Integer number = num;
		System.out.println("The input number is :"+num);
		System.out.println("The size of the number :"+number.SIZE);
		System.out.println("How many bytes the given number is taking ? :"+number.BYTES);
	}
	
	public static void string(String string) {
		System.out.println("Adding another string with"+string.concat(" This is the another string."));
		System.out.println("String to lower case : "+string.toLowerCase());
		System.out.println("String to Upper case : "+string.toUpperCase());
		
	}
	
	
}
