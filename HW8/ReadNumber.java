package homeWork8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {

		int a = 10;

		System.out.println("Please, input ten numbers!");
		for (int i = 0; i < a; i++) {
			System.out.println("Next number: ");
			try {
				System.out.println("Number which you entered - " + readNumber(1, 100));
			} catch (InvalidNumberException ex) {
				System.err.println(ex.getMessage());
			} catch (InputMismatchException ex) {
				System.err.println("You must input only number");
			}
			System.out.println("The program is working.");
		}
	}

	public static int readNumber(int start, int end) throws InvalidNumberException, InputMismatchException{
		Scanner sc = new Scanner(System.in);
		int inTheRangeOf = sc.nextInt();

		if (inTheRangeOf >= start && inTheRangeOf <= end) {
			return inTheRangeOf;
		} else {
			throw new InvalidNumberException("You entered invalid number. Pleas, enter number in the range [" + start + " - " + end + "]");
		}
	}
}
