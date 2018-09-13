import java.util.Scanner;

public class Getting_Acquainted {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String name, address;
		
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("Where do you live, " + name + "?");
		address = input.nextLine();
		System.out.println("Nice to meet you, " + name + " from " + address + "!");

	}

}
