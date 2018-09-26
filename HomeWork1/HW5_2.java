package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW5_2 {


	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int prod = 1;

		int[] arr = new int[10];

		System.out.println("Enter 10 number");

		for (int a = 0; a < arr.length; a++) {

			arr[a] = Integer.parseInt(br.readLine());

		}
		System.out.print(Arrays.toString(arr));

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
			} else
				for (i = 5; i < 10; i++) {
					prod = prod * arr[i];
				}
		}
		System.out.println("sum: " + sum);
		System.out.println("prod: " + prod);

	}
}
