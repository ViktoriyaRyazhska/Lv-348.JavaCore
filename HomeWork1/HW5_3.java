package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW5_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int imin = 0;
		int[] arr2 = { 5, 2, 8, 1,4};
		int min = arr2[0];
		int prod = 1;
		int n = 0;
		int t = 0;
		int i = 0;
		int count = 0;

		for (; i < 5; i++) {

			System.out.println("Insert number:");

			arr2[i] = Integer.parseInt(br.readLine());

			if (arr2[i] > 0) {
				prod = prod * arr2[i];
				n = i;
				n++;

			} else {
				break;
			}
		}

		if (i < 5) {
			System.out.println("Number of negativ element is: " + (n + 1));
		} else {
			System.out.println(Arrays.toString(arr2));
		}

		System.out.println("product is: " + prod);

		for (int j = 0; j < 5; j++) {
			n++;
			if (arr2[j] > 0) {
				t = j;
				t++;
				count++;

				if (count == 1) {
					break;
				}
				n = j;
			}
		}
		System.out.println("position second positive number is: " + (t + 1)+" place");
		
		
		for(int y = 0; y < 5; y++) {
			if (arr2[y] < min) {
				min = arr2[y];
				imin = y;
			}
		}
		System.out.println("MIN: " + min + " in place " + (imin + 1));
	}
}
