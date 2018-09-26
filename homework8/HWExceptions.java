import java.io.BufferedReader;
import java.io.IOException;

public class HWExceptions {

	
	//......................................TASK1.......................
	
	public static double div(double a, double b) throws ArithmeticException {

		if (b == 0) {

			throw new ArithmeticException();
		}

		else {

			return a / b;
		}
	}

	//......................................TASK2.......................
	
	private static int readNumber(int start, int end, BufferedReader reader) throws NumberFormatException, IOException {

		System.out.println("Enter yor numbers between 1 and 100");

		int a = Integer.parseInt(reader.readLine());

		if ((a < start) || (a > end)) {

			throw new NumberFormatException();

		}

		else {

			return a;

		}

	}

	public static void main(BufferedReader reader) throws NumberFormatException, IOException {

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = readNumber(1, 100, reader);
		}

		int OrderNumbers;

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {

					OrderNumbers = numbers[i];

					numbers[i] = numbers[j];

					numbers[j] = OrderNumbers;

				}
			}
		}

		System.out.println("Order of  numbers");

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}

	}

}
