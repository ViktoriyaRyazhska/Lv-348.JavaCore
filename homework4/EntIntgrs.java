import java.util.Scanner;

public class EntIntgrs {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = 0;
		int prodOfEvens = 1;
		String msgToUser = "Enter a positive integer number (negative to quit)";
		System.out.println(msgToUser);
		
		number = input.nextInt();
		while (number >= 0) {
			System.out.println(msgToUser);
			number = input.nextInt();
			if (number % 2 == 0 || number == 2) {
				prodOfEvens *= number;
		} 
	}
		System.out.println("Product of all even numbers if " + prodOfEvens);
		input.close();
		
		
		}
	}
