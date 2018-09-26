import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your values:");
		
		try {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(a%b != 0) {
				System.out.printf("%1.2f\n", FirstTask.div(a, b));
			} else {
				System.out.printf("%1.0f\n", FirstTask.div(a, b));
			}
		} catch(ArithmeticException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

		System.out.println("Hi");
		
	}

}
