package homework4;

import java.util.Scanner;

public class TenIntegerNumbers {

	public static void main(String[] args) {

		Scanner array = new Scanner(System.in);
		int[] tenIntegers = new int[10];
		for (int i = 0; i < tenIntegers.length; i++) {
			System.out.print("Enter " + (i + 1) + " integer: ");
			tenIntegers[i] = array.nextInt();
		}
		System.out.println(checkCondition(tenIntegers));
		array.close();
	}

	public static int amountFirst5Elements(int[] tenIntegers) {
		int count = 0;

		for (int i = 4; i >= 0; i--) {
			if (tenIntegers[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int checkCondition(int[] tenIntegers) {
		int sum = 0;
		int prod = 1;

		if (amountFirst5Elements(tenIntegers) == 5) {
			for (int i = 4; i >= 0; i--) {
				sum += tenIntegers[i];
			}
			return sum;
		} else {
			for (int i = 5; i < tenIntegers.length; i++) {
				prod *= tenIntegers[i];
			}
			return prod;
		}
	}

}
