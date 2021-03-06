
package HomeWork2P2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2P2Driver {
	private static int useInt, i = 0, counter = 0;
	private static int[] primNum;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			System.out.println("Enter an integer number: ");
			useInt = input.nextInt();
			if (useInt <= 1) {
				do {
					System.out.println("The input number has no prime number, please try another number");
					useInt = input.nextInt();
				} while (useInt <= 1);
			}
			primNum = new int[useInt];
			for (int p = 1; p <= useInt; p++) {
				primNum[p - 1] = p;
			}
			System.out.println(Arrays.toString(primNum));
			System.out.println("your prime numbers are: ");

			for (i = 1; i <= useInt; i++) {

				/**
				 * int index = 0; for (j = i; j >= 1; j--) { if (i % j == 0) {
				 * index = index + 1; } }
				 */

				if (calcPrim(i) == 2) {
					counter++;
					primNum[counter - 1] = i;
					for (int l = i; l <= useInt; l = calcNotPrime(l, i)) {
						primNum[l - 1] = 0;
					}
					System.out.print(i + ",");
				}
			}
			System.out.println();
			System.out.println(" There are " + counter + " prime number in your input integer");
			System.out.println(Arrays.toString(primNum));
			System.out.println();
			counter = 0;
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println();
		System.out.println("Goodbye");
	}

	/**
	 * Precondition: input is an Integer. Postcondition: Return a calculated
	 * integer number that if it is prime or not.
	 */
	public static int calcPrim(int a) {
		int result = 0, j = 0;
		for (j = a; j >= 1; j--) {
			if (a % j == 0) {
				result = result + 1;
			}
		}
		return result;
	}

	/**
	 * Precondition: inputs are both Integer. Postcondition: Return a calculated
	 * integer number.
	 */
	public static int calcNotPrime(int b, int c) {
		int result = b;
		result = result + c;
		return result;
	}
}
