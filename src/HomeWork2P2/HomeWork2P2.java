/**
 * package HomeWork2P2;
 * 
 * import java.util.Scanner;
 * 
 * public class HomeWork2P2 { private int useInt; private int[] numb;
 * 
 * public void readInput() { Scanner input = new Scanner(System.in);
 * System.out.println("Enter an integer number: "); useInt = input.nextInt(); if
 * (useInt <= 1){ do{ System.out.println("The input number has no prime number,
 * please try another number"); useInt = input.nextInt(); }while (useInt <= 1);
 * } numb = new int[useInt + 1]; } public HomeWork2P2(int u) { for (int i = 2; i
 * <= useInt; i++){ numb[i] = } } public int calcPrim(int a){ int prime = 0;
 * prime = a return prime; }
 * 
 * } package HomeWork2P2;
 * 
 * import java.util.Scanner;
 * 
 * //public class HomeWork2P2Dr { private static int useInt; private static
 * int[] numb, numb1;
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in); String response; do { System.out.println("Enter an
 * integer number: "); useInt = input.nextInt(); if (useInt <= 1) { do {
 * System.out.println("The input number has no prime number, please try another
 * number"); useInt = input.nextInt(); } while (useInt <= 1); } else if (useInt
 * == 2) { System.out.println("There is one prime number in this input"); } numb
 * = new int[useInt - 1]; numb1 = new int[useInt - 1]; int i;
 * 
 * for ( i = 0; i <= useInt - 2; i++) { numb[i] = i + 2; } //for (int i = 2; i
 * <= useInt - 1; i + 2) { for (int j = 3; j <= useInt - 1; j++){ numb[j - 3] =
 * clacNonPrim(j, 2); //System.out.print(numb1[j-3]); } for (int h = 3; h <=
 * useInt - 1; h++){ numb1[h - numb[0]] = clacNonPrim(h, numb[0]); }
 * 
 * 
 * int result = numb.length - numb1.length; System.out.println(result);
 * System.out.println(); System.out.println(" Do you want to continue? y/n");
 * response = input.next(); System.out.println(); } while
 * (response.equalsIgnoreCase("y")); System.out.println();
 * System.out.println("Goodbye"); }
 * 
 * public static int clacNonPrim(int p, int d) { int result = 0; if (p % d == 0)
 * result = 0; else result = p;
 * 
 * return result;
 * 
 * } }
 */