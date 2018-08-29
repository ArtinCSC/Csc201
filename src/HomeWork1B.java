
/** 
 * A program to accept two fractions and one operator (+, -, /, or*).
 * Print out the resulted reduced fraction.
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#1, problem 2  
 * 2 October 2016
 */

import java.util.Scanner;

public class HomeWork1B {
	// Precondition: inputs are both Integer.
	// Postcondition: Return a calculated integer number.
	public static int calcGCm(int a, int b) {
		return b == 0 ? a : calcGCm(b, a % b);
	}

	// Precondition: inputs are both Integer.
	// Postcondition: Return String.
	public static String asFraction(int a, int b) {
		int gcm = calcGCm(a, b);
		return (a / gcm) + "/" + (b / gcm);
	}

	public static void main(String[] args) {
		String response;
		int numeR = 0, comDeno = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter your first positive numerator");
			int nume1 = input.nextInt();
			if (nume1 == 0) {
				do {
					System.out.println("Your input is zero, which is not allowed, try again!");
					nume1 = input.nextInt();
				} while (nume1 == 0);
			}
			
			System.out.println("Enter your first positive denominator");

			int denom1 = input.nextInt();
			if (denom1 == 0) {
				do {
					System.out.println("Your input is zero, which is not allowed, try again!");
					denom1 = input.nextInt();
				} while (denom1 == 0);
			}
			System.out.println("Enter the operator");
			char operator = input.next().charAt(0);/**
			if ((operator != '*')) || (operator != '/') || (operator != '-') || (operator != '+')) {
				do {
					System.out.println("Your input operator is not allowed. Please try again.");
					operator = input.next().charAt(0);
				} while ((operator != '*')) || (operator != '/') || (operator != '-') || (operator != '+'));
			}*/
			System.out.println("Enter your second positive numerator");
			//int nume2 = input.nextInt();
			String nume2S = input.next();
			//int nume2 = Integer.parseInt(nume2S);
			int nume2 = nume2S.charAt(0);
			if ((nume2 <= 49) || ( nume2 >= 57)){
				do{
					System.out.println("Your input is not a number or is zero, which is not allowed, please try again!");
					 nume2S = input.next();
					 nume2 = nume2S.charAt(0);
						// nume2 = Integer.parseInt(nume2S);
				}while ((nume2 <= 49) || ( nume2 >= 57));
			}
/**
			if (nume2 == 0) {
				do{
				System.out.println("Your input is zero, which is not allowed, try again!");
				nume2 = input.nextInt();
				}while (nume2 == 0);
			}*/
			System.out.println("Enter your second positive denominator");
			int denom2 = input.nextInt();
			if (denom2 == 0) {
				do{
				System.out.println("Your input is zero, which is not allowed, try again!");
				denom2 = input.nextInt();
				}while (denom2 == 0);
			}
			nume2 = nume2 - 48;
			switch (operator) { // Calculate the number base on the operator.
			case '-':
				nume1 = nume1 * denom2;
				nume2 = nume2 * denom1;
				numeR = nume1 - nume2;
				comDeno = denom1 * denom2;
				break;
			case '+':
				nume1 = nume1 * denom2;
				nume2 = nume2 * denom1;
				numeR = nume1 + nume2;
				comDeno = denom1 * denom2;
				break;
			case '*':
				numeR = nume1 * nume2;
				comDeno = denom1 * denom2;
				break;
			case '/':
				numeR = nume1 * denom2;
				comDeno = denom1 * nume2;
				break;
			}
			if (numeR == 0) {
				System.out.println("The numerator result is zero, which is not allowed," + " try different numbers!! ");
			} else {
				String output = asFraction(numeR, comDeno);
				System.out.println("The result reduced fraction =  ( " + output + " )");
			}
			System.out.println();
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println();
		System.out.println("Goodbye");
	}
}
