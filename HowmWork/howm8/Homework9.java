package exceotion.howm8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Homework9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			double num1;
			double num2;
			int start;
			int end;
			


			System.out.print("Enter  num1: ");
			num1 = Double.parseDouble(br.readLine());
			System.out.print("Enter  num2: ");
			num2 = Double.parseDouble(br.readLine());
			try {
				double result = div(num1, num2);
				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.print("Enter START: ");
			start = Integer.parseInt(br.readLine());
			System.out.print("Enter END: ");
			end = Integer.parseInt(br.readLine());

			int[] arr = new int[10];
			try {
				for (int i = 0; i < arr.length; i++) {
					System.out.print("Enter " + (i + 1) + " Number: ");
					arr[i] = Integer.parseInt(br.readLine());
					System.out.println(readNumber(arr[i], start, end));
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} finally {
				br.close();
			}
		}
	}

	public static double div(double num1, double num2) throws ArithmeticException {
		if (num2 == 0) {
			throw new ArithmeticException("/0");
		}
		return num1 / num2;
	}

	public static int readNumber(int number, int start, int end) throws NumberFormatException {
		if (number >= start && number <= end) {
			return number;
		} else
			throw new NumberFormatException("Number is out of range.");
	}
}