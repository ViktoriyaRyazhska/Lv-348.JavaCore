import java.util.Scanner;

public class PalindromeString extends Menu {

	public void execute(Scanner sc) {
		
		System.out.println("Enter your String to check if its palindrome or not");
		
	    String	a = sc.nextLine();

		StringBuilder bilder = new StringBuilder(a);

		String b = bilder.reverse().toString();

		if (a.equals(b)) {

			System.out.println("This is palindrome String!" + a + "Sucsees!");

		} else {

			System.out.println("This String is Not palindrome..=(");

		}
	}

}
