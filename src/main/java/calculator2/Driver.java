package calculator2;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int first,second;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This is a calculator program");
		System.out.println("Please enter the first number");
		first = scan.nextInt();
		System.out.println("Please enter the second number");
		second = scan.nextInt();
		
		ScintificCalculator sc = new ScintificCalculator();
		
		sc.setA(first);
		sc.setB(second);
	}

}
