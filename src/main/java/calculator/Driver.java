package calculator;

import java.util.Scanner;

public class Driver {
	
	public static int num =1;
	public static int a , b;
	public static Scanner scan;
	public static Calculator cal;
	
	public static void main(String[] args) {
		
		System.out.println("This is calculator Program");
		cal = new Calculator();
		scan = new Scanner(System.in);
		
		calculator();
		
		System.out.println("Thank you for using Calculator");

	}
	
	private static void calculator() {
		while(num !=0) {
			//Taking input from user
			System.out.print("Enter the first number : ");
			a = scan.nextInt();
			System.out.print("Enter the second numbers : ");
			b = scan.nextInt();
			
			System.out.println("Enter 1 for Addition ");
			System.out.println("Enter 2 for Subtraction ");
			System.out.println("Enter 3 for Multiplication ");
			System.out.println("Enter 4 for Division ");
			System.out.println("Enter 0 to exit ");
			
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.println(cal.addNumbers(a, b));
				break;
			case 2:
				System.out.println(cal.subtractNumbers(a, b));
				break;
			case 3:
				System.out.println(cal.multiplyNumbers(a, b));
				break;
			case 4:
				System.out.println(cal.divideNumbers(a, b));
			default:
				break;
			}
		}
	}

}
