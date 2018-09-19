package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_2 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		
		System.out.println("Enter");
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		
		
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
