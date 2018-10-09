import java.util.Random;
import java.util.Scanner;

public class RandomValue extends Menu {

	public void execute(Scanner sc) {

		System.out.println("Input how many times you want to random numbers 1 and 2.");
		
		int s  = sc.nextInt();
		
		Random rand = new Random();
		
		int numberOne = 0;

		while (s > 0) {

			int a = rand.nextInt(2);

			s--;

			if (a == 1) {

				numberOne++;
			}
		}

		System.out.println("Number one was randomed :" + numberOne + " times");
	}

}
