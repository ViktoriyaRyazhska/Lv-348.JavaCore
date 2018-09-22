import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UScurrency {

	// TASK 3

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		final Pattern USCURRENCY = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");

		try {

			System.out.println("Enter the text from the that contains several occurrences of US currency.");

			String severaloccurrences = reader.readLine();

			Matcher findUS = USCURRENCY.matcher(severaloccurrences);

			while (findUS.find()) {

				System.out.print(severaloccurrences.substring(findUS.start(), findUS.end()) + " dolars ");
			}

		} catch (IOException e) {
			System.out.println(" Wrong Data " + e);
			e.printStackTrace();
		}

	}

}
