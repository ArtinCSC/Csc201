
/** 
 * A program to accept:
 * a) one positive decimal number (up to 5 digit in both side, integer and fraction) and print its equivalent binary number.
 * b) one positive binary number and print its equivalent decimal number.Binary fraction part cannot be truncated before 10 digit.
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#1, problem 1  
 * 2 October 2016
 */
import java.util.Scanner;

public class HomeWork1A {
	public static int binar = 2, decNumInt, b, f, remainFracInt, x, t, bin;
	public static double numFrac, r, d;
	public static String binDec, binFrac;

	public static void main(String[] args) {
		String response;
		int decRemain, i, j;
		int[] decRemain1 = new int[12];
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter one positive decimal number");
			double numWhole = input.nextDouble();

			decNumInt = (int) numWhole;
			numFrac = numWhole - decNumInt;
			System.out.print("The binary equivalent: \"");

			for (i = 1; i < 11; i++) {
				decRemain = calcRemainDec(b); // Collect the Remainder.
				decRemain1[i] = decRemain; // Collect them in an Array.
			}
			for (j = 10; j > 0; j--) {
				System.out.print(decRemain1[j]); // Change the order of the
													// Array.
			}
			System.out.print(".");
			for (int l = 1; l < 11; l++) {
				remainFracInt = calcRemainFrac(f); // Collect the remainder
													// fraction part.
				System.out.print(remainFracInt);
			}
			System.out.println("\"");
			System.out.println("\n" + "Enter one positive binary number");
			String binNumWhole = input.next();
			String dot = ".";
			int dotInt = binNumWhole.indexOf(dot);
			binDec = binNumWhole.substring(0, dotInt);
			binFrac = binNumWhole.substring(++dotInt);
			System.out.println("The decimal equivalent: \"" + (calcDecBinLas(r, t) + calcFracBinLas(d, x)) + "\"");
			System.out.println("\n" + " Do you want to continue? y/n");
			response = input.next();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}

	// Precondition: The integer input cannot be more than 9 digit.
	// Postcondition: Return a 10-digit binary number.
	public static int calcRemainDec(int b) {
		int result = 0;
		for (int i = 1; i < 11; i++)
			result = decNumInt % binar; // Collect the remainder.
		decNumInt = decNumInt / binar;
		return result;
	}

	// Precondition: The integer input cannot be more than 9 digit.
	// Postcondition: Return a 10-digit binary number.
	public static int calcRemainFrac(int f) {
		double remainFrac = 0;
		int result = 0;
		for (int i = 1; i < 11; i++)
			remainFrac = numFrac * binar; // Collect the decimal part.
		result = (int) remainFrac;
		numFrac = remainFrac - result;
		return result;
	}

	// Precondition: The integer input is 1 digit & String is user's input
	// fraction and decimal part.
	// Postcondition: Return an one-digit integer.
	public static int calcBinarDigit(int l, String bina) {
		int result = 0;
		String binDig = "";
		if (l == 0) {
			binDig = bina.substring(bina.length() - 1); // Separating it

		} else {
			binDig = bina.substring(bina.length() - 1 - l, bina.length() - l);

		}
		result = Integer.parseInt(binDig); // Converting to Integer.
		return result;
	}

	// Precondition: double input is the power of the calculation & is 1 digit.
	// Postcondition: Return a calculated double number.
	public static double calcDecBin(double w) {
		double result = Math.pow((double) binar, w); // Calculate the power.
		return result;
	}

	// Precondition: inputs are double and Integer.
	// Postcondition: Return a calculated double number.
	public static double calcDecBinLas(double r, int t) {
		double result = 0;
		int h;
		for (h = binDec.length() - 1; h >= 0; h--)
			result = result + (calcDecBin(h) * calcBinarDigit(h, binDec));
		return result;
	}

	// Precondition: inputs are double and Integer.
	// Postcondition: Return a calculated double number.
	public static double calcFracBinLas(double d, int f) {
		double result = 0;
		int h = 0;
		for (h = -1; h >= -binFrac.length(); h--)
			result = result + (calcDecBin(h) * calcBinarDigit((h + binFrac.length()), binFrac));
		return result;
	}
}