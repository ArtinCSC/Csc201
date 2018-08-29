
/**
 * DRIVER 
 * A program to accept two fractions and one operator (+, -, /, or*).
 * Print out the resulted reduced fraction.
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#2, problem 1  
 * 18 October 2016
 */

package HomeWork2;

import java.util.Scanner;

public class HomeWork2P1Driver {

	public static void main(String[] args) {
		char operator = ' ';
		String response;
		do {
			HomeWork2P1 fraction = new HomeWork2P1(operator);
			fraction.readInput();
			new HomeWork2P1(operator);
			System.out.println(fraction);
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}
}
