
// Java code to change dollar amounts (in cents) 
// to quarters, dimes, nickels and pennies. 

import java.util.Scanner;

public class NewMoneyChanger {

	public static void main(String[] args) throws java.io.IOException { // This is for error handling

		Scanner KeyboardInput = new Scanner(System.in);
		int amount, originalAmount, quarters, dimes, nickels, pennies;

		System.out.println("Enter number of cents for the.");
		System.out.println("money you want to change.");
	
		amount = (int) KeyboardInput.nextInt();
		// amount = 123;
		originalAmount = amount;

		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;

		System.out.println(originalAmount + " cents in coins:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels and");
		System.out.println(pennies + " pennies");

		System.out.println("Press enter key to end program.");


	}

}
