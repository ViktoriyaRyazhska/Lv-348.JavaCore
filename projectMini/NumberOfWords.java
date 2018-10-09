package Teem;

import java.util.Scanner;

public class NumberOfWords implements Execute {
	public static void getSixth() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text");
		String input = sc.nextLine();
		{


			int count = 0;

			if (input.length() != 0) {
				count++;

				for (int i = 0; i < input.length(); i++) {

					if (input.charAt(i) == ' ') {
						count++;
					}
				}
			}

			System.out.println("You enter " + count + " " + "word");
		}
	}

	
	@Override
	public void exec() {
		getSixth();
	}

}
