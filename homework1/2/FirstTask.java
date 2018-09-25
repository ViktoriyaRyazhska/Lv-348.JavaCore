import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

	public static int squareRectangle(int a, int b) throws NumberFormatException {

		if ( (a < 0) || (b < 0) ) {

			throw new NumberFormatException();

		} else {

			return a * b;
		}

	}

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Enter first side of rectangle");

			int a = Integer.parseInt(reader.readLine());

			System.out.println("Enter second side of rectangle");

			int b = Integer.parseInt(reader.readLine());

			System.out.println("Square of your rectangle is : " + squareRectangle(a, b));

		} catch (NumberFormatException | IOException e) {

			System.out.println("Wrong data. Value is not positive number or it is text " + e);

			e.printStackTrace();
		}

	}

}
