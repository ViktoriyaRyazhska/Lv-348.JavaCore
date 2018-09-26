import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("Enter first number");

			double a = Double.parseDouble(reader.readLine());

			System.out.println("Enter second number");

			double b = Double.parseDouble(reader.readLine());

			System.out.println(HWExceptions.div(a, b));

		} catch (NumberFormatException | ArithmeticException | IOException e) {

			System.err.println(" Your data is wrong, or division by zero");

			e.printStackTrace();

		}

		try {

			HWExceptions.main(reader);

		} catch (NumberFormatException | IOException e) {

			System.err.println("Are you  sure that your number is between 1 and 100  and you didn't type the text?");

			e.printStackTrace();

		} finally {

			try {

				reader.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
