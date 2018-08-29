
/** 
 * OBJECT
 * A program to accept two fractions and one operator (+, -, /, or*).
 * Print out the resulted reduced fraction.
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#2, problem 1  
 * 18 October 2016
 */

package HomeWork2;

import java.util.Scanner;

public class HomeWork2P1 {
	private static int nume1, denom1, nume2, denom2, numeR, comDeno;
	private static char operator;
	private String myString = " ";

	public void readInput() {
		int Asc = 48, operInt;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first positive numerator");
		String nume1S = input.next();
		nume1 = nume1S.charAt(0);
		if ((nume1 <= 49) || (nume1 >= 57)) {
			do {
				System.out.println("Your input is not a vaid number, please try again!");
				nume1S = input.next();
				nume1 = nume1S.charAt(0);
			} while ((nume1 <= 49) || (nume1 >= 57));
		}
		System.out.println("Enter your first positive denominator");
		String denom1S = input.next();
		denom1 = denom1S.charAt(0);
		if ((denom1 <= 49) || (denom1 >= 57)) {
			do {
				System.out.println("Your input is not a vaid number, please try again!");
				denom1S = input.next();
				denom1 = denom1S.charAt(0);
			} while ((denom1 <= 49) || (denom1 >= 57));
		}
		System.out.println("Enter the operator");
		String operS = input.next();
		operInt = operS.charAt(0);
		if ((operInt <= 41) || (operInt >= 44) && (operInt != 45) && (operInt != 47)) {
			do {
				System.out.println("Your input is not a vaid operator, please try again!");
				operS = input.next();
				operInt = operS.charAt(0);
			} while ((operInt <= 41) || (operInt >= 44) && (operInt != 45) && (operInt != 47));
		}
		System.out.println("Enter your second positive numerator");
		String nume2S = input.next();
		nume2 = nume2S.charAt(0);
		if ((nume2 <= 49) || (nume2 >= 57)) {
			do {
				System.out.println("Your input is not a vaid number, please try again!");
				nume2S = input.next();
				nume2 = nume2S.charAt(0);
			} while ((nume2 <= 49) || (nume2 >= 57));
		}
		System.out.println("Enter your second positive denominator");
		String denom2S = input.next();
		denom2 = denom2S.charAt(0);
		if ((denom2 <= 49) || (denom2 >= 57)) {
			do {
				System.out.println("Your input is not a vaid number, please try again!");
				denom2S = input.next();
				denom2 = denom2S.charAt(0);
			} while ((denom2 <= 49) || (denom2 >= 57));
		}
		nume1 = nume1 - Asc;
		denom1 = denom1 - Asc;
		nume2 = nume2 - Asc;
		denom2 = denom2 - Asc;
		operator = (char) operInt;
	}

	public HomeWork2P1(char o) {
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
	}

	/**
	 * Precondition: inputs are both Integer. Postcondition: Return a calculated
	 * integer number.
	 */
	 static int calcGCm(int a, int b) {
		int result = 0;
		if (b == 0) {
			result = a;
		} else {
			result = calcGCm(b, a % b);
		}
		return result;
	}

	/**
	 * Precondition: inputs are both Integer. Postcondition: Return String.
	 */

	 static String asFraction(int a, int b) {
		int gcm = calcGCm(a, b);
		return (a / gcm) + "/" + (b / gcm);
	}

	public String toString() {
		if (numeR == 0) {
			myString = "The numerator result is zero, which is not allowed," + " try different numbers!! ";
		} else {
			String output = asFraction(numeR, comDeno);
			myString = "The result reduced fraction =  ( " + output + " )";
		}
		return myString;
	}
}
