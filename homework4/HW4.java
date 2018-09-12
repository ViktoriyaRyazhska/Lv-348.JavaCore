import java.io.BufferedReader;
import java.io.IOException;

public class HW4 {

	public static void Months(BufferedReader reader) {

		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		try {
			System.out.println("Insert number of month");
			int i = monthDays[Integer.parseInt(reader.readLine()) - 1];
			System.out.println("This is month with " + i + " days");
		} catch (NumberFormatException | IOException e) {
			System.out.println("Insert number of the Month! " + e);
			e.printStackTrace();
		}

	}

	public static void NumbersCalculate(BufferedReader reader) {

		int[] numbers = new int[10];

		for (int a = 0; a < numbers.length; a++) {
			System.out.println("Insert number in array on position " + a);
			try {
				numbers[a] = Integer.parseInt(reader.readLine());

			} catch (NumberFormatException | IOException e) {
				System.out.println("Insert correct number! " + e);
				e.printStackTrace();
			}
		}

		int min = numbers[0];
		for (int i = 0; i < 5; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		if (min < 0) {
			int product = 1;
			for (int i = 5; (i >= 5) && (i < numbers.length); i++) {
				if (numbers[i] > 0) {
					product *= numbers[i];
				}
			}
			System.out.println("Product of last 5 elements is = " + product);
		}

		else {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += numbers[i];
			}
			System.out.println("Sum of first 5 elements is= " + sum);
		}
	}

	public static void findMinPos(BufferedReader reader) {

		int[] minPos = new int[5];

		for (int a = 0; a < minPos.length; a++) {
			System.out.println("Insert number in array on position " + a);
			try {
				minPos[a] = Integer.parseInt(reader.readLine());

			} catch (NumberFormatException | IOException e) {
				System.out.println("Insert correct number! " + e);
				e.printStackTrace();
			}
		}

		int min = minPos[0];
		int imin = 0;

		for (int i = 0; i < minPos.length; i++) {
			if (minPos[i] < min) {
				min = minPos[i];
				imin = i;
			}
		}
		System.out.print("Minimum is  " + min);
		System.out.println(" is in " + (imin + 1) + " place");

	}

	public static void ToFirstNeg(BufferedReader reader) {

		int[] numbers = new int[100];

		for (int a = 0; a < numbers.length; a++) {
			System.out.println("Insert number in array on position " + a);
			try {
				numbers[a] = Integer.parseInt(reader.readLine());
				if (numbers[a] < 0) {
					break;
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("Insert correct number! " + e);
				e.printStackTrace();
			}
		}

		int product = 1;

		for (int i = 0; i < numbers.length; i++) {

			if ((numbers[i] % 2 == 0) && (numbers[i] > 0)) {
				product *= numbers[i];
			}
		}
		System.out.println("Product of even numbers is : " + product);

	}

}
