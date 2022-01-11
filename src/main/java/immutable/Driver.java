package immutable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int amount ;
		
		//Calculation of Tax using mutable class
		System.out.print("Enter the amount that you want to  : $");
		Scanner scan = new Scanner(System.in);
		try {
			amount = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("The amount that you entered should be NUMBER");
			amount = 0;
		}
		finally {
			scan.close();
		}
		//Calculating tax 
		System.out.println("The amount you will be paying is : $"+Tax.taxCalculation(amount));
		
		
	}

}
