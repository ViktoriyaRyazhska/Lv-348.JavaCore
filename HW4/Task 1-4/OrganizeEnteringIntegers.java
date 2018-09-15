package homework4;

import java.util.Scanner;

public class OrganizeEnteringIntegers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input integer number: ");
		System.out.println("Product of all entered even numbers equals: " + getProd(sc));
		
	}
		
		public static int getProd(Scanner sc){
		int enteredNumber = sc.nextInt();
		int prod = 1;
		while (enteredNumber >= 0) {
			enteredNumber = sc.nextInt();
			if ((enteredNumber % 2) == 0) {
				prod *= enteredNumber;
			}
			if (enteredNumber < 0) {
				break;
			}
		}
		sc.close();
		return prod;
		}
}
