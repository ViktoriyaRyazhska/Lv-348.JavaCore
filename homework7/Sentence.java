import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

                        // TASK 1 !

public class Sentence {

	private static void words(BufferedReader reader) {

		try {
			
			System.out.println("Set your sentense of five words");

			String[] words = reader.readLine().split(" ");

			if (words.length == 5) {
				
				StringBuilder bilder = new StringBuilder(words[1]);

				Arrays.sort(words, Comparator.comparing(String::length, Comparator.reverseOrder()));

				System.out.println(" The longest word is " + words[0]);
				
				
				System.out.println(" The longest word have  " + words[0].length() + " letters");
				
		
				
				System.out.println("Second word in reverse order: " + bilder.reverse());

			}

			else {

				System.out.println("Are you sure that your word has a maximum of 5 words?");

				words(reader);

			}

		} catch (IOException e) {

			System.out.println("This is wrong data" + e);

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		words(reader);

	}
}
