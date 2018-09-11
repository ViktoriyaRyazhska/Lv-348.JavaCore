package homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pleas, input any three integer numbers in next lines: ");
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());

		checkMaxValue(a, b, c);
		checkMaxValue(b, a, c);
		checkMaxValue(c, b, a);

		checkMinValue(a, b, c);
		checkMinValue(b, a, c);
		checkMinValue(c, b, a);

	}

	public static void checkMaxValue(int a, int b, int c) {
		if (a >= b && a > c) {
			System.out.println("Max value - " + a);
		}
	}

	public static void checkMinValue(int a, int b, int c) {
		if (a <= b && a <= c) {
			System.out.println("Min value - " + a);
		}
	}

}
