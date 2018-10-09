import java.util.Scanner;

public class CalculateNumbersofWords extends Menu {

	public void execute(Scanner sc) {

		System.out.println("Input your text to count words in it");
		
		String a  = sc.nextLine();
		
		String[] size = a.split(" ");

		int words = size.length;

		System.out.println("This text have :" + size + " words.");

	}

}
