package homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pleas, input any three float numbers in next lines: ");
		float a = Float.parseFloat(bf.readLine());
		float b = Float.parseFloat(bf.readLine());
		float c = Float.parseFloat(bf.readLine());
		checkFloatNumber(a);
		checkFloatNumber(b);
		checkFloatNumber(c);

	}

	public static void checkFloatNumber(float r) throws IOException {

		System.out.println("Your choice - " + r);
		if (r > -5 && r < 5) {
			System.out.println("This number belongs to the range \r\n");
		} else {
			System.out.println("This number doesn't belong to the range \r\n");
		}
	}
}